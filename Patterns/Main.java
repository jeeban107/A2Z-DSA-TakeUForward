package Patterns;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int rev=0;
        int last;
        while (n>0)
        {
            last = n%10;
            n = n/10;
            rev =( rev * 10)+last;

        }
        System.out.println(rev);

    }
}
