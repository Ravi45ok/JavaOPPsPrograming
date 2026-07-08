import java.util.Iterator;
public class linkedlistClass implements Iterable<Integer> {
    Node head;
    int size;
    Node tail;
    // ! Node Inner class
    private static class Node {
    int data;
    Node next;

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}
// ! add
    void add(int data) {
        if (size == 0) {
            Node n = new Node(data, null);
            head = n;
            tail = n;
            size++;
        } else {
            Node n = new Node(data, null);
            tail.next = n;
            tail = n;
            size++;
        }
    }
    // ! get element at index
    int get (int index){
        if(index< size && index >size) throw new IndexOutOfBoundsException();
        Node currentNode=head;
        for(int i=0; i<index; i++){
            currentNode= currentNode.next;
        }
        return currentNode.data;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new itr();
    }
// ! Inner class for Iterator implemention
    private class itr implements Iterator<Integer> {
        Node it = new Node(0, head);// dummmy node

        @Override
        public boolean hasNext() {
            if (it.next == null)
                return false;
            else
                return true;
        }

        @Override
        public Integer next() {
            if (hasNext()) {
                it = it.next;
                return it.data;
            } else
                return null;
        }

    }
    @Override
    public String toString() {
        StringBuffer str= new StringBuffer();
        Node current= head;
        while(current != null){
             str.append(current.data).append(" ");
             current=current.next;
        }
        return new String(str);

    }
}

class mainClass {
    public static void main(String[] args) {
        linkedlistClass list = new linkedlistClass();
        list.add(10);
        list.add(40);
        list.add(50);
        list.add(70);
        for (int n : list) {
            System.out.println(n);
        }
        list.add(89);
        System.out.println(list);
        System.out.println("get the element");
        System.out.println( list.get(5));
       
    }
}
