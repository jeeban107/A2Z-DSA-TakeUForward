package Patterns;

import java.util.Scanner;

import static java.lang.Math.min;

public class Pattern22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n  = sc.nextInt();
            int top,bottom,left,right;
        for (int i = 0; i <2*n -1 ; i++) {
            for (int j = 0; j <2*n -1 ; j++) {
                 top =i;
                  left =j;
                 right=(2*n- 2)-j ;
                 bottom = (2*n - 2)-i;
                System.out.print(n - min(min(top,bottom), min(right,left)) + " ");
            }
            System.out.println();
        }
    }
}
