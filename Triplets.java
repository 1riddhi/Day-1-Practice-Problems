import java.util.Arrays;
import java.util.Scanner;

public class Triplets{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of integers (N): ");
        int n = scanner.nextInt();

      
        System.out.println("Enter the integers:");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        
        findTripletsWithZeroSum(arr);

        scanner.close();
    }

   
    private static void findTripletsWithZeroSum(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i + 1; j < arr.length ; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (i!=j && j!=k && k!=i && (arr[i] + arr[j] + arr[k] == 0)) {
                       
                        System.out.println( arr[i] + ", " + arr[j] + ", " + arr[k]);
                        count++;
                    }
                }
            }
        }

      
        System.out.println("Total number of distinct triplets with sum 0: " + count);
    }
}
