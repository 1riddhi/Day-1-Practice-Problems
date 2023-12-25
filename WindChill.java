public class WindChill {
    public static void main(String[] args) {
       
        if (args.length != 2) {
            System.out.println("Please provide exactly two double command-line arguments (t and v).");
            return;
        }

      
        double t = Double.parseDouble(args[0]);
        double v = Double.parseDouble(args[1]);

      
        if (Math.abs(t) > 50 || v > 120 || v < 3) {
            System.out.println("t should be in the range [-50,50] and v should be in the range [3,120].");
            return;
        }

        
        double windChill = 35.74 + 0.6215 * t + ((0.4275*t-35.75)*Math.pow(v, 0.16));
      
        System.out.println("Wind Chill: " + windChill);
    }
}
