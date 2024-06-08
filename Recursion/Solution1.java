package Recursion;
import java.util.*;

public class Solution1 {

    private static final int MOD = 1000000007;

    public static long sumOrProduct(int n, int q) {
        if (q == 1) {
            return (long) n * (n + 1) / 2;
        } else if (q == 2) {
            long product = 1;
            for (int i = 1; i <= n; i++) {
                product = (product * i) % MOD;
            }
            return product;
        }
        return -1; // in case q is neither 1 nor 2
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int q = scanner.nextInt();
            System.out.println(sumOrProduct(n, q));
        }
        scanner.close();
    }
}
