/**
 * mergeSort
 * Divide and conquer
 * Recursive
 * stable
 * Not inplace
 * space complexity - O(n)
 * Time complexity - O(nlogn)
 */
public class mergeSort {

    public static void main(String[] args) {
        int[] myArray = new int[] {7,6,5,4,3,2,1};
        // int[] myArray = new int[] {2,7,4,1,5,3};
        // int[] myArray = new int[] {1,2,3,4,5,6,7};
        int myArrayLength = myArray.length;
        System.out.println("before merge sort");
        for(int i=0;i<myArrayLength;i++) {
            System.out.print(myArray[i]);
        }
        System.out.println();
        myArray = mergeSortMethod(myArray);
        System.out.println("after merge sort");
        for(int i=0;i<myArrayLength;i++) {
            System.out.print(myArray[i]);
        }  
    }

    public static int[] mergeSortMethod(int[] A) {
        int arrayLength = A.length;
        if(arrayLength < 2) {
            return A;
        }
        
        int mid = arrayLength/2;
        int[] left = new int[mid];
        int[] right = new int[arrayLength-mid];

        for(int i=0;i<mid;i++) {
            left[i] = A[i];
        }

        for(int i= mid;i<arrayLength;i++){
            right[i-mid] = A[i]; 
        }

        mergeSortMethod(left);
        mergeSortMethod(right);
        return merge(left, right, A);
    }

    public static int[] merge(int[] L, int[] R, int[] A) {
        
        int nL = L.length;
        int nR = R.length;
        int  i, j, k;
        i=j=k=0;

        while(i<nL && j<nR) {
            if(L[i]<R[j]) {
                A[k] = L[i];
                i++;
            }
            else{
                A[k] = R[j];
                j++;
            }
            k++;
        }

        while(i<nL) {
            A[k] = L[i];
            i++;
            k++;
        }

        while(j<nR) {
            A[k] = R[j];
            j++;
            k++;
        }

        return A;
    }
}