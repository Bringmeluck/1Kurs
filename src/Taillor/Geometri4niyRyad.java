package Taillor;

/**
 * Created by user on 27.10.2015.
 */
public class Geometri4niyRyad {
    public static void main(String[] args) {
        int i;
        double x = 6;
        double result = 1;
        double y = 1;
        for (i = 1; i < 20; i++){
            y = y * x;
            result = result + y;
        }
        System.out.println(result);
    }
}
