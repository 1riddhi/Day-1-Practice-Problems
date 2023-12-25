import java.util.Scanner;
public class LeapYear{
    static void isLeapYear(int year){
      
        if (String.valueOf(year).length() != 4) {
            System.out.println("Input should be a 4-digit number.");
            return;
        }
         if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            System.out.println(year+" is leap year.");
            return;
         }
         System.out.println(year+" is not leap year");
         
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter year(YYYY)");
        int year=sc.nextInt();
        isLeapYear(year);
    }
}