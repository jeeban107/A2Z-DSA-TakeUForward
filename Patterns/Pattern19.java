package Patterns;

import java.util.Scanner;

public class Pattern19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n  = sc.nextInt();
        int ins = 0;
        for (int i = 0; i <n ; i++) {
            //start
            for (int j = 1 ;j <= n-i ; j++) {
                System.out.print("*");
            }
            //space
            for (int k = 0; k <ins ; k++) {
                System.out.print(" ");
            }
            //star

                for (int j = 1; j <= n-i ; j++) {
                    System.out.print("*");
                }
            ins+=2;
            System.out.print("\n");
        }
         ins =2*n -2;
        for (int i= 1 ;i <=n; i++){

            //start
            for (int j = 1 ;j <= i ; j++) {
                System.out.print("*");
            }
            //space
            for (int k = 0; k <ins ; k++) {
                System.out.print(" ");
            }
            //start
            for (int l = 1; l <= i ; l++) {
                System.out.print("*");
            }
            ins-=2;
            System.out.print("\n");

        }

    }
}
