package Basic_Maths;

import java.util.Scanner;

import static java.lang.Math.min;


public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two number");
        int n1 =  sc.nextInt();
        int n2 = sc.nextInt();
        int gcd =0;
//        for (int i = 1; i < min(n1,n2); i++) {
//                if (n1 % i ==0 && n2 % i==0) {
//                   gcd = i;
//                }
//        }

        //2nd Method

//        for (int i = min(n1,n2); i >=1 ; i--) {
//            if (n1 % i ==0 && n2 % i==0) {
//                gcd = i;
//                break;
//            }
//        }
//
//
//        System.out.println("GCD =" +gcd);




//        3rd Method

    while(n1>0 && n2>0){
     if(n1 >n2)  n1= n1%n2;
     else  n2 = n2%n1;
    }

    if(n1==0) System.out.println(gcd =n2);
    else System.out.println(gcd = n1);

    }
}
