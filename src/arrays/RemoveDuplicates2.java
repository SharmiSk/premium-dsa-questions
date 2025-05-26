package arrays;

import java.util.Scanner;

public class RemoveDuplicates2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the capacity for the Arrat :");
        int len = sc.nextInt();
        System.out.println("Enter the lenth of the Array :");
        int A[] = new int[len];
        for (int i = 0; i < len; i++) {
            A[i] = sc.nextInt();
        }

        int result = remove(A);
        System.out.println("Duplicated array count is :" + result);

    }

    public static int remove(int[] A) {
        int i = 0;
        for (int n : A) {
            if (i < 2 || n != A[i - 2]) {
                A[i++] = n;

            }
        }
        return i;
    }

}
