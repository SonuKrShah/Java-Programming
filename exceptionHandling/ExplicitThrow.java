package exceptionHandling;

public class ExplicitThrow {
    public static void main(String[] args) {
        int balance = 5000;
        int withDrawAmount = 6000;

        try {
            if(balance < withDrawAmount) {
                throw new ArithmeticException("Insufficient Balance");
            }   
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }

        

        balance -= withDrawAmount;
        System.out.println("Transaction successfully Completed");
        System.out.println("Program continues...");
    }
}
