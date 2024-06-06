package Recursion;

import java.util.Scanner;

public class PrintUptoN {

  public void PrintNumber(int i ,int n){
        if(i>n){
            return;
        }
        System.out.print(i+" ");
        PrintNumber(i+1,n);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num  = sc.nextInt();

        PrintUptoN pn = new PrintUptoN();
        pn.PrintNumber(1, num);


    }
}
