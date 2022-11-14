package SecondWeek;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int year = s.nextInt();
        if(year % 400 == 0){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
