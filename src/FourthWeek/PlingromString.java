package FourthWeek;

public class PlingromString {

    static boolean isPalindrome2(String word){
        String reverse = "";
        for(int i=word.length()-1; i>=0; i--){
            reverse += word.charAt(i);
        }
        return word.equals(reverse);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome2("kayak"));
    }
}
