package Basic_Maths;

import java.util.*;

import static java.lang.Math.sqrt;

public class PrintDivisor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        List<Integer> Ans = new ArrayList<>();
        //TC = O(sqrt(n))
        for (int i = 1; i <= sqrt(n) ; i++) {
            if(n % i == 0) {
                Ans.add(i);
                if(i != n / i)
                    Ans.add(n / i);
            }
            }
        Collections.sort(Ans);
        System.out.println(Ans);
    }
}
