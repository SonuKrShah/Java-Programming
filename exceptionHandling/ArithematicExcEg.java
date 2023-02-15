package exceptionHandling;

public class ArithematicExcEg {
    public static void main(String[] args) {
        String str = null;
        try {

            System.out.println(3/1);
            System.out.println(str.length()); 
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());

        } finally {
            System.out.println("This is finally block");
        }

        System.out.println("Something going on outside.");
    }
}
