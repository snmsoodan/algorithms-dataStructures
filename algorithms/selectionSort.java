package algorithms;

/**
 * selectionSort Time complexity - O(n^2)
 */
public class selectionSort {

    public static void main(String[] args) {
        int[] myArray = new int[] {7,6,5,4,3,2,1};
        // int[] myArray = new int[] {2,7,4,1,5,3};
        // int[] myArray = new int[] {1,2,3,4,5,6,7};
        int myArrayLength = myArray.length;
        System.out.println("before selection sort");
        for(int i=0;i<myArrayLength;i++) {
            System.out.print(myArray[i]);
        }
        System.out.println();
        selectionSortMethod(myArray, myArrayLength);

        System.out.println("after selection sort");
        for(int i=0;i<myArrayLength;i++) {
            System.out.print(myArray[i]);
        }
    }

    public static void selectionSortMethod(int[] A, int n) {
        for(int i=0;i<n-1;i++) {
            int temp;
            int imin = i;
            for(int j=i+1;j<n;j++) {
                if(A[j] < A[imin]) {    //find the index of the minimum element  
                    imin = j;
                }

                temp = A[i];
                A[i] = A[imin];
                A[imin] = temp;
            }
        }
    }
}