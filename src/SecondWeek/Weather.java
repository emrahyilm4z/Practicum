package SecondWeek;

public class Weather {
    public static void main(String[] args) {
        int weather = 17;
        if (weather <= 5) {
            System.out.println("Kayak yapmalısın");
        } else if (weather > 5 && weather <= 15) {
            System.out.println("Sinemaya gidebilirsin");
        } else if (weather > 15 && weather <= 25) {
            System.out.println("tam pikniklik hava");
        } else {
            System.out.println("Bı sıcakta bir yüzmen var :D");
        }
    }
}
