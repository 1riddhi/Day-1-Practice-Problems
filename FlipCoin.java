import java.util.Random;

public class FlipCoin{
    public static void main(String []args){

        if(args.length==0) {
            System.out.println("Enter positive number in command line argument");
            return ;
        }
        int n=Integer.parseInt(args[0]);
            if (n <= 0) {
            System.out.println("Number of flips should be a positive integer.");
            return;
        }

        int head=0,tail=0;
        Random random=new Random();
        for(int i=0;i<n;i++){
            double probability=random.nextDouble();
            if(probability<0.5) tail++;
            else head++;
        }
        double headPercentage = (double) head/ n * 100;
        double tailPercentage = (double) tail/ n * 100;

        System.out.println("Heads: " + headPercentage + "%");
        System.out.println("Tails: " + tailPercentage + "%");

    }
}