package Patterns;

import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n  = sc.nextInt();
        for (int i = 0; i <n ; i++) {
            //Sapce
            for (int j = 0; j <n-i-1 ; j++) {
                System.out.print(" ");
            }
            //Alphabets
            char ch ='A';
            int breakpoint =( 2* i +1 ) /2;
            for (int j = 1; j <=2 *i +1 ; j++) {
                System.out.print(ch);
                if (j<= breakpoint) ch++;
                else  ch--;
            }

            //space
            for (int l = 0; l <n-i-1 ; l++) {
                System.out.print(" ");
            }
            System.out.println("\n");
        }
    }
}
