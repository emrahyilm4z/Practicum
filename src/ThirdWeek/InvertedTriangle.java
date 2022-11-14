package ThirdWeek;

import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args) {
        int i,sayi,j,k,l;
        Scanner input = new Scanner(System.in);

        System.out.println("Basamak sayısını giriniz: ");
        sayi = input.nextInt();

        for(i=sayi;i>=1;i--){
            for(j=sayi-i;j>=1;j--){
                System.out.print(" ");
            }
            for(k=(2*i-1);k>=1;k--){
                System.out.print("*");
            }
            System.out.println(" ");

        }


    }
}
