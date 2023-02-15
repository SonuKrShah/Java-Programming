package collections.arrayList;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListBasics {
    public static void main(String[] args) {
        Integer[] temp = new Integer[5];
        Arrays.fill(temp, -1);
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(temp));

        System.out.println("Printing something");
        for(Integer ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}