package ThirdWeek;

import java.util.Scanner;

public class ThreeAndFourAverage {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int count = 0, sum = 0;
        for (int i = 0; i < a; i++) {
            if (i % 3 == 0 || i % 4 == 0) {
                sum += i;
                count++;
            }
        }
        System.out.println(sum / count);
    }
}
