package Basic_Maths;

import java.util.Scanner;


public class AmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int dup =n;
        int sum =0;
        
        while (n>0) {
             int lastdigit = n %10;
            sum = sum + (lastdigit*lastdigit*lastdigit);
            n= n/10;

        }
        if (dup == sum){
        System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
    
}
