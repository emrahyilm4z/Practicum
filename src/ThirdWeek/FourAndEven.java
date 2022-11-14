package ThirdWeek;

import java.util.Scanner;

public class FourAndEven {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum = 0;
        while (s.hasNext()) {
            int a = s.nextInt();
            if (a % 4 == 0) {
                sum += a;
            }
        }
    }
}
