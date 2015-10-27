package lab1;

/**
 * Created by user on 27.10.2015.
 */
public class SwapVariables {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        b = a + b;
        a = b - a;
        b = b - a;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

