package Taillor;

/**
 * Created by user on 26.10.2015.
 */
public class Cos1 {
    public static void main(String[] args) {
        int i;
        double x = Math.PI / 6;
        double sum1 = 0;
        double sum2 = 0;
        double nominator = 1;
        long fact = 1;
        for (i = 1; i < 20; i++);
        {
            fact = fact * 2 * i * (2 * i + 1);
            nominator = nominator * x * x;
            if (i % 2 == 0) {
                sum2 = sum2 + nominator / fact;
            } else {
                sum1 = sum1 + nominator / fact;
            }
            double result = 1 + sum1 - sum2;
            System.out.println(result);
        }
    }
}
