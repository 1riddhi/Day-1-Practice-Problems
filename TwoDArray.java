import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows (M): ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns (N): ");
        int cols = scanner.nextInt();
       
        Object[][] array2D = read(rows, cols);

        print(array2D);
    }

  
    private static Object[][] read(int rows, int cols) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the elements of the 2D array:");

        Object[][] array2D = new Object[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (scanner.hasNextInt()) {
                    array2D[i][j] = scanner.nextInt();
                } else if (scanner.hasNextDouble()) {
                    array2D[i][j] = scanner.nextDouble();
                } else if (scanner.hasNextBoolean()) {
                    array2D[i][j] = scanner.nextBoolean();
                } else {
                    System.out.println("Invalid input!!! Please enter integers, doubles, or booleans.");
                    System.exit(0);
                }
            }
        }

        return array2D;
    }

    
    private static void print(Object[][] array2D) {
        System.out.println("The 2D array is:");

        for (Object[] row : array2D) {
            for (Object element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }
}
