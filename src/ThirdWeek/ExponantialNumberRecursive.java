package ThirdWeek;

public class ExponantialNumberRecursive {
    static int a(int a, int b){
        if(b<1){
            return a;
        }else{
            return a(a*b,--b);
        }

    }
    public static void main(String[] args) {
        System.out.println(a(2,2));
    }
}
