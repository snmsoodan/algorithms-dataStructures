package algorithms;

/**
 * insertionSort Time complexity best case O(n) average case - worst case -
 * O(n^2) insertion sort is better than bubble and selection sort in terms of
 * number of comparisons
 */
public class insertionSort {

    public static void main(String[] args) {
        int[] myArray = new int[] {7,6,5,4,3,2,1};
        // int[] myArray = new int[] {2,7,4,1,5,3};
        // int[] myArray = new int[] {1,2,3,4,5,6,7};
        int myArrayLength = myArray.length;
        System.out.println("before insertion sort");
        for(int i=0;i<myArrayLength;i++) {
            System.out.print(myArray[i]);
        }
        System.out.println();
        insertionSortMethod(myArray, myArrayLength);

        System.out.println("after insertion sort");
        for(int i=0;i<myArrayLength;i++) {
            System.out.print(myArray[i]);
        }
    }

    public static void insertionSortMethod(int[] A, int n) {
        for(int i=1;i<n;i++) {
            int hole = i;
            int value = A[i];

            while(hole>0 && A[hole-1]>value) {
                A[hole] = A[hole-1];
                hole=hole-1;
            } 
            A[hole] = value;
        }
    }
}