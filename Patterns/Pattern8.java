package Patterns;

import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n  = sc.nextInt();
        for (int i = 0; i <n ; i++) {
            //Sapce
            for (int j = 0; j <i ; j++) {
                System.out.print(" ");
            }
            //stars
            for (int k = 0; k <2*n -(2 *i +1) ; k++) {
                System.out.print("*");
            }
            //space
            for (int l = 0; l <i; l++) {
                System.out.print(" ");
            }
            System.out.println("\n");
        }
    }
}
