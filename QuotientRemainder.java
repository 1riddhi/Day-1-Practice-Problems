public class QuotientRemainder {
    public static void main(String[] args) {
      
        if (args.length != 2) {
            System.out.println("Please provide two command-line arguments (dividend and divisor).");
            return;
        }

       
        float dividend = Float.parseFloat(args[0]);
        float divisor = Float.parseFloat(args[1]);

        if (divisor != 0) {
            
            float quotient = dividend / divisor;
            float remainder = dividend % divisor;

           
            System.out.println("Quotient: " + quotient);
            System.out.println("Remainder: " + remainder);
        } else {
            System.out.println("Cannot divide by zero. Please enter a non-zero divisor.");
        }
    }
}
