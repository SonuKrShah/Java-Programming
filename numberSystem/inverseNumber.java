package numberSystem;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class inverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            arr.add(input.nextInt());
        }

        for(Integer ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();

        ArrayList<Integer> inverseArr = new ArrayList<>(Collections.nCopies(n, 0));
        for (int i = 0; i < n; i++) {
            inverseArr.set(arr.get(i)-1, i+1);
            // System.out.println(inverseArr);
        }

        for(Integer ele : inverseArr) {
            System.out.print(ele + " ");
        }
        System.out.println();

        input.close();
    }
}
