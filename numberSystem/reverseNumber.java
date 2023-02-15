package numberSystem;
import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        
        int reverseNumber = 0;
        while(num > 0) {
            reverseNumber = reverseNumber * 10 + num%10;
            num /= 10;
        }

        System.out.println(reverseNumber);
        input.close();
    }
}
