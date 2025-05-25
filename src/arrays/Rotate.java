package arrays;

import java.util.Scanner;

public class Rotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the capacity of the Arrays: ");

        int len = sc.nextInt();
        System.out.println("Enter the length of the Array index :");

        int A[] = new int[len];

        for (int i = 0; i < len; i++) {
            A[i] = sc.nextInt();

        }
        System.out.println("Enter the '1' of Right direction or '0' for left direction :");
        int dir = sc.nextInt();
        System.out.println("Enter the Number of Rotations: ");
        int x = sc.nextInt();

        if (dir == 1) {
            reverse(A, 0, len - 1);
            reverse(A,0,x-1);
            reverse(A,x,len-1);


        } else if (dir ==0){
          reverse(A,0,len-1);
          reverse(A,0,len-x-1);
          reverse(A,x,len-1);

        }else{
            System.out.println("Wrong Input Rotation: "+ x);
        }
        for (int i : A) {
            System.out.print(i + " ");
        }
    }
        public static void reverse(int A[], int l, int r){
            while(l < r){
                int temp = A[l];
                A[l] = A[r];
                A[r]= temp;
                l++;
                r--;
        }

    }
}
