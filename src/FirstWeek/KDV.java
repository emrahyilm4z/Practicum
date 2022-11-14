package FirstWeek;

import java.util.Scanner;

public class KDV {
    public static void main(String[] args) {
        int KDV;
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        KDV = a > 1000 && a <0 ? 18 : 8;
        System.out.println(KDV * a / 100);
    }
}
