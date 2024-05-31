package Patterns;

public class Pattern10 {
    public static void main(String[] args) {
        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j <5 -i -1 ; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }

    }
}
