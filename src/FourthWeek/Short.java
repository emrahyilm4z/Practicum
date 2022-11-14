package FourthWeek;

import java.util.*;

public class Short {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Integer> integers = new ArrayList<>();
        while (s.hasNext()){
            integers.add(s.nextInt());
        }
        Collections.sort(integers);
        for (Integer integer : integers) {
            System.out.println(integer);
        }
    }
}
