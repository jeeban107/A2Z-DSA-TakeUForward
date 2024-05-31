package Patterns;

import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n  = sc.nextInt();
        for (int i = 0; i <n ; i++) {
            //Sapce
            for (int j = 0; j <n-i-1 ; j++) {
                System.out.print(" ");
            }

            //stars
            for (int k = 0; k <(2 *i +1) ; k++) {
                System.out.print("*");
            }

            //space
            for (int l = 0; l <n-i-1 ; l++) {
                System.out.print(" ");
            }

            System.out.println("\n");
        }

        for (int i = 0; i <n ; i++) {
            for (int m = 0; m <i ; m++) {
                System.out.print(" ");
            }
            for (int q = 0; q< 2*n -(2*i+1)  ; q++) {
                System.out.print("*");
            }
            for (int o = 0; o <i; o++) {
                System.out.print(" ");
            }
            System.out.println("\n");
        }
    }
}
