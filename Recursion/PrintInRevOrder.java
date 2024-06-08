package Recursion;

import java.util.Scanner;


class Solution{
    public void PrintNumber( int n){
         Helper(n,n);
    }

    void Helper(int i ,int n){

        if(i < 1){
            return;
        }
        System.out.print(i+" ");
        Helper(i-1,n);
    }
}

public class PrintInRevOrder {
    public static void main(String[] args) {
        Scanner sc   = new Scanner(System.in);
        int N =sc.nextInt();
            Solution1 s = new Solution1();
            s.PrintNumber(N);

    }
}
