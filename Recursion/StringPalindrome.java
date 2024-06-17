package Recursion;

import java.util.Scanner;

public class StringPalindrome {

static boolean IsPalindrome(String str, int i){
    if(i>= str.length()/2){
        return  true;
    }
    if (str.charAt(i) != str.charAt(str.length()- i - 1))
        {
            return false;
        }
    return  IsPalindrome(str ,i+1);
}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        boolean ans =IsPalindrome(str,0);

        if(ans){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }

    }
}
