package Recursion;

import java.util.Scanner;

public class Factorial {
    public int Fact(int n){
        if (n==1){
            return 1;
        }
        return n * Fact(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Factorial f = new Factorial();

        System.out.println(f.Fact(n));

    }
}
