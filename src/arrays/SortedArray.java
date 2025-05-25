package arrays;

public class SortedArray {
    public static void main(String[] args) {


        int A[] = {2,5,7,8};
        int B[] = {1,3,6,9,11,14,17};
        int c[]=  sorted(A,B);

        for (int i : c){
            System.out.print(i + " ");
        }

    }
    private static int[] sorted(int A[],int B[]){
     int mergedArray[] = new int[A.length+B.length];
     int i = 0,j = 0,k =0;

     while(i < A.length && j < B.length){
         if(A[i] < B[j]){
             mergedArray[k++] = A[i++];
         }else{
             mergedArray[k++] = B[j++];

         }

     }
     while(i < A.length ){
         mergedArray[k++] = A[i++];
     }
     while (j < B.length){
         mergedArray[k++] = B[j++];
     }

        return mergedArray;
    }


}
