package Recursion;

import java.util.Scanner;

public class nEWrES {


    static  void PrintNum(int i , int n){
        if(i<1){
            return;
        }

            PrintNum(i-1,n);
            System.out.print(i+" ");


    }

    static  void PrintNum2(int i , int n){
        if(i>1){
            return;
        }

        PrintNum(i+1,n);
        System.out.print(i+" ");


    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        PrintNum2(1,n);
        PrintNum(n,n);
    }
}
