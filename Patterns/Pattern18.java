package Patterns;

import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n  = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (char ch = 'C'; ch >= 'C' - i; ch--) {
                System.out.print(ch+ " ");
            }
            System.out.print("\n");
        }

    }
}
