package Taillor;

/**
 * Created by user on 06.10.2015.
 */
public class Taillor1 {
    public static void main(String[] args) {

        double x = 2;
        double result = 1;
        long fact = 1;
        double nominator = 1;
        for (int i = 1; i < 20; i++){
            fact = fact * i;
            nominator = nominator * x;
            result = result + nominator / fact;


        }
        System.out.println(result);
        System.out.println(result - Math.E * Math.E);
    }
}
