package ThirdWeek;

import java.util.Scanner;

public class BigAndSmalNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        while (s.hasNext()) {
            int a = s.nextInt();
            if (a > max) {
                max = a;
            }
            if (a < min) {
                min = a;
            }
        }
    }
}
