package SecondWeek;

import java.util.Scanner;

public class Ticket {
    public static void main(String[] args) {
        double mesafe, normal, yasind, indirim, gido, toplam;
        int yas, tip;
        Scanner input = new Scanner(System.in);

        System.out.println("Yaşınızı Giriniz");
        yas = input.nextInt();

        System.out.println("Mesafe Giriniz");
        mesafe = input.nextDouble();

        System.out.println("Yolculuk Tipini Giriniz 1. Tek Yön // 2. Gidiş-Dönüş");
        tip = input.nextInt();

        if (yas > 0 && mesafe > 0 && tip == 1 || tip == 2) {

            normal = mesafe * 0.10;

            if (yas < 12) {

                yasind = normal * 0.5;
                indirim = normal - yasind;
                toplam = indirim;
                if (tip == 2) {
                    gido = indirim * 0.2;
                    toplam = (indirim - gido) * 2;
                }
                System.out.println("Bilet Tutarı= " + toplam);
            }

            if (yas >= 12 && yas <= 24) {
                yasind = normal * 0.1;
                indirim = normal - yasind;
                toplam = indirim;
                if (tip == 2) {
                    gido = indirim * 0.2;
                    toplam = (indirim - gido) * 2;
                }
                System.out.println("Bilet Tutarı= " + toplam);
            }

            if (yas > 24 && yas < 65) {
                normal = mesafe * 0.10;
                toplam = normal;
                if (tip == 2) {
                    gido = normal * 0.2;
                    toplam = (normal - gido) * 2;
                }
                System.out.println("Bilet Tutarı= " + toplam);
            }

            if (yas >= 65) {
                yasind = normal * 0.3;
                indirim = normal - yasind;
                toplam = indirim;
                if (tip == 2) {
                    gido = indirim * 0.2;
                    toplam = (indirim - gido) * 2;
                }
                System.out.println("Bilet Tutarı= " + toplam);
            }

        } else {
            System.out.println("Hatalı Veri Girdiniz");
        }
    }
}
