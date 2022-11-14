package ThirdWeek;

import java.util.Scanner;

public class ExponantialNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(),  b = s.nextInt();
        int sum = 1;
        for (int i = 1; i <= b; i++) {
            sum *= a;
        }
        System.out.println(sum);
    }
}
