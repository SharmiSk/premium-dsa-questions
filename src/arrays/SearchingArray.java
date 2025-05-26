package arrays;

public class SearchingArray {
    public static void main(String[] args) {
        int A[] ={2,4,5,6,7,8,9,10,12};
       int result = search(A,8);
        System.out.print("Searching An array in this list is : "+result);
    }

    public static int search(int[] A, int key){
        int num = A.length;
        int start = 0;
        int end = num - 1;


        while(start <= end){
            int mid = (start+end)/2;
            if(A[mid] == key){
                return mid;
            } else if (A[mid] < key) {
                start = mid+1;

            } else if (A[mid] > key) {
                end = mid -1;

            }

        }

        return  -1;
    }
}
