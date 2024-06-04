package Basic_Maths;
import java.lang.Math;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int count = 0;
        for (int i = 1; i <= sqrt(n) ; i++) {
                 if(n % i == 0)
                 {
                   count++;
                   if(n/i != i){
                      count++;
                    }
                 }
        }
        if(count == 2) {
            System.out.println("Prime Number");
        }
        else {
            System.out.println("Not a Prime Number");
        }
    }
}
