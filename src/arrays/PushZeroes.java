package arrays;

import java.util.Scanner;

public class PushZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the capacity of the Array. . ");
        int len = sc.nextInt();
        System.out.println("Enter the Array list: ");
        int A[] = new int[len];
        for(int i = 0; i<len;i++){
            A[i]=sc.nextInt();
        }
        push(A);
        for (int i : A){
            System.out.print(i + " ");
        }


    }

    public static void push(int A[]){
        int len = A.length;
        int nz = 0;
        int z =0;
        while(nz < len){
            if(A[nz] != 0){
                int temp = A[nz];
                A[nz] = A[z];
                A[z]= temp;
                z++;
            }
            nz++;
        }
    }
}
