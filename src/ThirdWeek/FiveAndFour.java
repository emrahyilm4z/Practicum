package ThirdWeek;

import java.util.Scanner;

public class FiveAndFour {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            int a = s.nextInt();
            if (a % 4 == 0 && a % 5 == 0) {
                System.out.println(a);
            }
        }
    }
}

