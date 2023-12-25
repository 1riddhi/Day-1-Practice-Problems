import java.util.Scanner;
public class HarmonicNumber{
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter value of N");
        int number=input.nextInt();
        
        double result=0.0;
        for(int i=1;i<=number;i++){
             result+=(1.0/i);
        }

        System.out.println("Nth harmonic number is : "+result);

        input.close();
    }
}