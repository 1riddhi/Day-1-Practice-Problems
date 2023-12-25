public class Quadratic {
    public static void main(String[] args) {
        // Check if exactly three command-line arguments are provided
        if (args.length != 3) {
            System.out.println("Please provide exactly three double command-line arguments (a, b, and c).");
            return;
        }

       
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            // Two distinct real roots
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println("delta>0");
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);

        } else if (delta == 0) {
          
            double root = -b / (2 * a);
            System.out.println("delta=0");
            System.out.println("Root: " + root);
        } else {
            // Complex roots
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-delta) / (2 * a);

            System.out.println("delta<0");
            System.out.println("Root 1: " + realPart + " + i " + imaginaryPart );
            System.out.println("Root 2: " + realPart + " - i " + imaginaryPart );
        }
    }
}
