package Firstpackage;

/**
 * Created by user on 29.09.2015.
 */
public class Secondequation {
    public static void main(String[] args) {
        int a = 1;
        int b = 10;
        int sum1 = 0;
        int sum2 = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                sum1 = sum1 + i;
            } else {
                sum2 = sum2 + i;
            }
            System.out.println(i);

        }
        System.out.println(sum1);
        System.out.println(sum2);

    }
}
