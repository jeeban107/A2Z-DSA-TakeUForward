package Recursion;

import java.util.Scanner;

public class SumOfNumber {
//functional way
    public int Sum(int n){
        if(n==0){
            return 0;
        }
        return n + Sum(n-1);
    }

    //Parameter way
    public void Sum2(int i,int sum ){
        if(i<1){
            System.out.println(sum);
            return;
        }
        Sum2(i-1 ,sum+i);
    }


    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        SumOfNumber s = new SumOfNumber();
//        System.out.println(s.Sum(n));

        s.Sum2(n,0);

    }
}
