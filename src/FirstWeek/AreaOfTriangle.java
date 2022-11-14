package FirstWeek;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner kenar = new Scanner(System.in);
        System.out.print("a kenarını giriniz :");
        int a = kenar.nextInt();
        System.out.print("b kenarını giriniz :");
        int b = kenar.nextInt();
        System.out.print("c kenarını giriniz :");
        int c = kenar.nextInt();
        double u = (a + b + c) / 2;
        double S = Math.sqrt((u * (u - a) * (u - b) * (u - c)));
        System.out.println("Üçgenin alanı :" + S);
    }

}
