package FirstWeek;

import java.util.Scanner;

public class Taximeter {
    public static void main(String[] args) {
        int km,startPrice = 10;
        double perKm = 2.20, total,taxiFace;
        Scanner scanner = new Scanner(System.in);
        km = scanner.nextInt();
        total = startPrice + (km * perKm);
        taxiFace = (total < 20) ? 20 : total;
        System.out.println("Taxi face : " + taxiFace);
    }
}
