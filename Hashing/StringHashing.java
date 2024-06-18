package Hashing;

import java.util.Scanner;

public class StringHashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");   
        String str = sc.next();

        int hash[] = new int[26];
        for (int i = 0; i < str.length(); i++) {
                hash[str.charAt(i) - 'a']+=1;
        }
        
        System.out.println("enter the No of Query ");
        int q = sc.nextInt();
        while(q-- > 0){
            char c =sc.next().charAt(0);
            System.out.println(c +"->" +hash[c - 'a']+" times");
        }
            
            
        
    }
}
