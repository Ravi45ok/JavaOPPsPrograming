import java.util.Arrays;

public class method {
    public static void main(String[] args) {
        int arr[]={40, 59, 24, 34, 89, 56};

        //! Arrays.sort(arr)
        // * time complexity -> O(nlog n)
        //*  Space complexity -> O(logn)

        Arrays.sort(arr);
        for(int i: arr) System.out.print(i + " ");
        System.out.println();
        
        // ! Arrays.binarySearch(arr, int element)  
       int index= Arrays.binarySearch(arr, 59) ;
       System.out.println(index);
        // * time complexity -> O(log n)

        // ! Arrays.fill(arr, int value)
        // * Sets all elements to the specified value
        Arrays.fill(arr, 0);
        System.out.println(Arrays.toString(arr));

        // ! Arrays.equals(arr1, arr2)
        // * Compares two arrays for equality
        int arr2[] = {0, 0, 0, 0, 0, 0};
        System.out.println(Arrays.equals(arr, arr2));

        // ! Arrays.copyOf(arr, int length)
        // * Copies array to specified length
        int arr3[] = Arrays.copyOf(arr, 3);
        System.out.println(Arrays.toString(arr3));

        // ! Arrays.copyOfRange(arr, int from, int to)
        // * Copies range from index 'from' to 'to'
        int arr4[] = Arrays.copyOfRange(arr, 1, 4);
        System.out.println(Arrays.toString(arr4));

        // ! Arrays.asList(arr)
        // * Converts array to List
        System.out.println(Arrays.asList(arr));
    }
}
