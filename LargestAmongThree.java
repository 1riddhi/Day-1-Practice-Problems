public class LargestAmongThree {
    public static void main(String[] args) {
        
        if (args.length != 3) {
            System.out.println("Please provide three command-line arguments (num1, num2, num3).");
            return;
        }

        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[1]);
        double num3 = Double.parseDouble(args[2]);
      
        double largest = Math.max(Math.max(num1, num2), num3);
        
        System.out.println("The largest number is: " + largest);
    }
}
