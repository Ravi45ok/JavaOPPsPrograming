import java.util.Stack;

//! it adds 5 methods on top of list Interface
public class methods {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        // ! 1. E push(E e)// *same as add() method, adds element on the top of stack.
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.add(40);
        stack.add(50);
        System.out.println(stack);
        // ! 2. E pop()//* remove element at the top of the stack */
        int ele = stack.pop();
        System.out.println(ele);
        System.out.println(stack);
        // !3. peek() returns the top element
        int top = stack.peek();
        System.out.println(top);
        // !4. search(Object o)
        // returns 1-based position from TOP
        // top element = 1, element below = 2 etc.
        // returns -1 if not found
        int index= stack.search(40);
        System.out.println(index);
        stack.clear();
        // ! 5. empty()-> check weather stack is empty or not same as isEmpty()
        System.out.println(stack.empty());
        System.out.println(stack.isEmpty());
    }
}
