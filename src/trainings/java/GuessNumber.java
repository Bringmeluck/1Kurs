package trainings.java;

import java.util.Scanner;

/**
 * Created by user on 26.10.2015.
 */
public class GuessNumber {
    public static void main(String[] args) {
        int a = 100;
        int b = 0;
        double c;
        c = (a+b) / 2;
        while (true) {
            System.out.println(c);
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine();
            if (answer.equals("������")) {
                c = c / 2 +c;
            } else if (answer.equals("�����")) {
                c = c / 2;
            } else if (answer.equals("�� �������")) {
                break;
            }
        }
    }
}
