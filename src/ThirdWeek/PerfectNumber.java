package ThirdWeek;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner inp =new Scanner(System.in);
        int sayi=0;

        System.out.println("Lütfen bir sayı giriniz :");
        int n1=inp.nextInt();

        for (int i=1;i<=n1;i++){
            if (n1%i==0){
                sayi=(sayi+i);

            }
        }
        sayi-=n1;
        if (sayi==n1){
            System.out.println( n1 + " Mükemmel sayıdır");
        }else {
            System.out.println( n1 +" Mükemmel bir sayı değildir");
        }

    }
}
