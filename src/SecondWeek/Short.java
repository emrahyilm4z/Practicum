package SecondWeek;

import java.util.*;

public class Short {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            integers.add(i);
        }
        Collections.sort(integers);
    }
}
