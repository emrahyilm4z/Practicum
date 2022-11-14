package FirstWeek;

import java.util.Scanner;

public class GradeAverage {
    public static void main(String[] args) {
        int matematik, fizik, kimya, turkce, tarih, muzik;
        Scanner s = new Scanner(System.in);

        System.out.print("Matematik Notunuz:");
        matematik = s.nextInt();

        System.out.print("Fizik Notunuz:");
        fizik = s.nextInt();

        System.out.print("Kimya Notunuz:");
        kimya = s.nextInt();

        System.out.print("Turkce Notunuz:");
        turkce = s.nextInt();

        System.out.print("Tarih Notunuz:");
        tarih = s.nextInt();

        System.out.print("Müzik notunuz:");
        muzik = s.nextInt();

        int toplam = (matematik + fizik + kimya + turkce + tarih + muzik);
        float ortalama = toplam / 6;

        System.out.println("Ortalamanız: " + ortalama);

        String sonuc = ortalama > 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(sonuc);
    }
}
