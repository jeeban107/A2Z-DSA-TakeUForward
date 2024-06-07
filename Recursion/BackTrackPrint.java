package Recursion;

import java.util.Scanner;

class Back {
    void BackFun(int i, int n) {
        if (i < 1) {
            return;
        }
        BackFun(i - 1, n);
        System.out.print(i + " ");
    }

    void BackFun2(int i, int n) {
        if (i >n) {
            return;
        }
        BackFun2(i + 1, n);
        System.out.print(i + " ");
    }
}

public class BackTrackPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        Back b = new Back();
        Back b2 = new Back();

        b.BackFun(n, n);
        System.out.println(); // For better readability
        b2.BackFun2(1,n );
    }
}
