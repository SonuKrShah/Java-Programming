package exceptionHandling;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        try {
            System.out.println("Division : " + a/b);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }

        System.out.println("Printing something here");
        input.close();
    }
}
