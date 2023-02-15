package numberSystem;
import java.util.Scanner;

public class rotateNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int digits = (int)(Math.log10(num)) ;
        int n = input.nextInt() % digits;

        System.out.println(n);
        // while(n > 0) {
        //     int c = num / (int)Math.pow(10, digits);
        //     System.out.println(num + " " + c);
        //     num = num % (int)Math.pow(10, digits);
        //     num = num*10 + c;
        //     n--;
        // }
        int c = num / (int)Math.pow(10, n);
        System.out.println(c);
        num = num % (int)Math.pow(10, n);
        System.out.println(num);
        int rotatedNumber = num * (int)Math.pow(10, n+1) + c;

        System.out.println(rotatedNumber);
        input.close();
    }
}