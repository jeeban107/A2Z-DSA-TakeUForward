package Hashing;

import java.util.Scanner;

public class NoOfEle {
    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in);

        System.out.print("Enter the size of the array :");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i <n ; i++) {
            arr[i]= sc.nextInt();
        }

        //Pre-computation

        int hash[] = new int[13];
        for (int i = 0; i <n ; i++) {
            hash[arr[i]] += 1;
        }
        
        
        System.out.println("Enter the no of Query");
        int Q = sc.nextInt();

        while (Q-- != 0){
            int number;
            number= sc.nextInt();
            System.out.println(number+" -> "+ hash[number]+ "times");
        }

    }

}
