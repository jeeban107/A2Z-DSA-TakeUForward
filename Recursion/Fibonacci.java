package Recursion;

import java.util.Scanner;

public class Fibonacci {

  public int  Fibo(int n){
        if  (n<= 1){
            return n;
        }
        int last = Fibo(n-1);
        int slast = Fibo(n-2);
       return  last + slast;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        System.out.println("Enter the nth Number");
        int n =  sc.nextInt();
        Fibonacci f = new Fibonacci();

        System.out.println( f.Fibo(n));


    }
}
