package Recursion;

public class printName {
    static int count = 0;
    static void Func()
    {
        if (count ==5){
            return;
        }
        System.out.println("Jeeban Behera");
        count ++;
        Func();
    }
    public static void main(String[] args) {

        Func();

    }
}
