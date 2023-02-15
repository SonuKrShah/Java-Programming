package leetCode;

import java.util.ArrayList;
import java.util.HashSet;

public class fruitIntoBasket {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(2);
        al.add(2);

        int maxValue = 0;

        for (int i = 0; i < al.size(); i++) {
            HashSet<Integer> set = new HashSet<>();
            int num = 0;
            for (int j = i; j < al.size(); j++) {
                set.add(al.get(j));
                num++;
                if(num > maxValue)
                    maxValue = num;
                if (set.size() > 2) {
                    break;
                }
            }
        }

        System.out.println(maxValue);
    }
}
