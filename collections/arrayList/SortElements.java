package collections.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortElements {

    static void display(ArrayList<Integer> arr) {
        for(Integer ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0;i<n;i++) {
            arr.add(input.nextInt());
        }
        display(arr);
        Collections.sort(arr);
        display(arr);
        input.close();
    }
}
