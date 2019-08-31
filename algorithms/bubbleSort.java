/**
 * bubbleSort
 * time complexity - O(n^2) 
 *  Best case - O(n)
 *  Average case - O(n^2)
 *  Worst Case - 
 * space complexity - 
 */
public class bubbleSort {

    public static void main(String[] args) {
        int[] myArray = new int[] {7,6,5,4,3,2,1};
        // int[] myArray = new int[] {2,7,4,1,5,3};
        // int[] myArray = new int[] {1,2,3,4,5,6,7};
        int myArrayLength = myArray.length;
        System.out.println("before bubble sort");
        for(int i=0;i<myArrayLength;i++) {
            System.out.print(myArray[i]);
        }
        System.out.println();
        bubbleSortMethod(myArray, myArrayLength);

        System.out.println("after bubble sort");
        for(int i=0;i<myArrayLength;i++) {
            System.out.print(myArray[i]);
        }
    }

    public static int[] bubbleSortMethod(int[] A,int n) {

        // for(int i=0; i<n-1;i++) {
        //     for(int j=0;j<n-1;j++) {
        //         int temp;
        //         if(A[j]> A[j+1]) {
        //             temp=A[j];
        //             A[j] = A[j+1];
        //             A[j+1] = temp;
        //         }
        //     }
        // }
        //-----improvement
        for(int i=0; i<n-1;i++) {
            System.out.println("pass"+(i+1));
            int flag=0;
            for(int j=0;j<n-i-1;j++) {  //here n-i-1
                int temp;
                if(A[j]> A[j+1]) {
                    temp=A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                    flag=1;
                }
            }
            if(flag == 0) break;
        }

        return A;

    }

}