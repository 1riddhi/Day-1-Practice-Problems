class PowerOf2{
    public static void main(String []args){
         if (args.length != 1) {
            System.out.println("Please provide a single command-line argument (n).");
            return;
        }
        int n = Integer.parseInt(args[0]);
        if (n < 0 || n >= 31) {
            System.out.println("n should be between 0 (inclusive) and 31 (exclusive).");
            return;
        }
       
        for (int i = 0; i <= n; i++) {
            int result =(int) Math.pow(2.0, i);
            System.out.println("2^" + i + " = " + result);
        }

    }
}