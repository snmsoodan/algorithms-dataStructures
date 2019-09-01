package algorithms;

import java.util.Random;

/**
 * quickSort
 * Divide and Conquer
 * recursive
 * Not stable
 * Time complexity 
 * Best case O(nlogn)
 * Worst case O(n^2) this can be avoided using randomised quicksort
 */
public class quickSort {

    public static void main(String[] args) {
        int[] myArray = new int[] {7,6,5,4,3,2,1};
        // int[] myArray = new int[] {2,7,4,1,5,3};
        // int[] myArray = new int[] {1,2,3,4,5,6,7};
        int myArrayLength = myArray.length;
        System.out.println("before quick sort");
        for(int i=0;i<myArrayLength;i++) {
            System.out.print(myArray[i]);
        }
        System.out.println();
        quickSortMethod(myArray, 0, myArrayLength-1);
        System.out.println("after quick sort");
        for(int i=0;i<myArrayLength;i++) {
            System.out.print(myArray[i]);
        }  
    }

    public static void quickSortMethod(int[] A, int start, int end) {
        if(start < end) {
            int pIndex = randomizedPartition(A, start, end);
            quickSortMethod(A, start, pIndex-1);
            quickSortMethod(A, pIndex, end);
        }
    }

    public static int partition(int[] A, int start, int end) {

        int pivot = A[end];
        int pIndex = start;

        for(int i=start;i<end;i++) {
            int temp;
            if(A[i]< pivot) {
                temp = A[i];
                A[i] = A[pIndex];
                A[pIndex] = temp;
                pIndex++;
            }
        }

        int temp;
        temp = A[end];
        A[end] = A[pIndex];
        A[pIndex] = temp; 
        return pIndex;
    }

    public static int randomizedPartition(int[] A, int start, int end) {
        Random random = new Random();
        int randomPivot = random.nextInt(end+1-start) + start;
        int temp = A[end];
        A[end] = A[randomPivot];
        A[randomPivot] = temp;
        return partition(A, start, end);
    }


}