package FirstWeek;

import java.util.Scanner;

public class GreenGrocer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int armut, elma, domates, muz, patlican;
        armut = input.nextInt();
        elma = input.nextInt();
        domates = input.nextInt();
        muz = input.nextInt();
        patlican = input.nextInt();
        double x = (2.14 * armut) + (3.67 * elma) + (1.11 * domates) + (0.95 * muz) + (5.0 * patlican);
        System.out.print("Toplam tutar:" + x);
    }
}
