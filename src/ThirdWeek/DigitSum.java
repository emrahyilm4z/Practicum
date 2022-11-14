package ThirdWeek;

public class DigitSum {
    public static void main(String[] args) {
        int a  = 14;
        int sum = 0;
        for (int i = 0; i < String.valueOf(a).length(); i++) {
            sum += Integer.parseInt(String.valueOf(String.valueOf(a).charAt(i)));
        }
        System.out.println(sum);
    }
}
