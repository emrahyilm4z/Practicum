package SecondWeek;

import java.util.Scanner;

public class GradeStatus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your math grade: ");
        int math = scanner.nextInt();

        System.out.print("Please enter your physics grade: ");
        int physics = scanner.nextInt();

        System.out.print("Please enter your Turkish grade: ");
        int turkish = scanner.nextInt();

        System.out.print("Please enter your chemistry grade: ");
        int chemistry = scanner.nextInt();

        System.out.print("Please enter your music grade: ");
        int music = scanner.nextInt();

        if (math < 0 || math > 100) math = 0;
        if (physics < 0 || physics > 100) physics = 0;
        if (turkish < 0 || turkish > 100) turkish = 0;
        if (chemistry < 0 || chemistry > 100) chemistry = 0;
        if (music < 0 || music > 100) music = 0;

        double average = (math + physics + turkish + chemistry + music) / 5;

        if (average >= 55) {
            System.out.println("Congratulations, you passed the grade.");
        } else {
            System.out.println("Unfortunately, you failed. See you next year.");
        }
    }
}
