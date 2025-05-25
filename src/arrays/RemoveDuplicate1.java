package arrays;

public class RemoveDuplicate1 {
    public static void main(String[] args) {
        int arr[] = {2, 2, 3, 3, 5, 5, 7, 8, 8, 9};

        int rd = remove(arr);
        for (int i = 0; i < rd; i++) {
            System.out.print(arr[i] + " ");
        }


    }

    static int remove(int[] arr) {
        int rd = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[rd] != arr[i]) {
                rd++;
                arr[rd] = arr[i];

            }

        }

        return rd + 1;
    }

}
