import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         
        System.out.print("Enter number(Integer): ");
        int n=scanner.nextInt();
           
        if(n%2!=0)
        System.out.println(n+" is odd");
        else  System.out.println(n+" is even");

        scanner.close();
    }
}
