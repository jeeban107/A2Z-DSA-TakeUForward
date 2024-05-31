package Patterns;

import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space = 2* (n-1);
        for (int i = 1; i <=n ; i++) {
            //number
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
            }

            //space
            for (int k = 1; k <=space; k++) {
                System.out.print(" ");
            }
            //number
            for (int m =i ; m >=1; m--) {
                System.out.print(m);
            }

            System.out.println("\n");
            space -=2;
        }

    }
}
