package Patterns;

import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            char ch  = (char)(int)('A'+ i) ;
            for (int j = 0; j <= i; j++)
            {
                System.out.print(ch);
            }
            System.out.print('\n');
        }

    }
}
