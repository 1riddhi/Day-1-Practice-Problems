import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        if ((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')) {
            String result = "Consonant";
            if ("AEIOUaeiou".indexOf(ch) != -1) {
                result = "Vowel";
            }
            System.out.println(ch + " is a " + result + ".");
        } else {
            System.out.println("Invalid input. Please enter an alphabet.");
        }

        scanner.close();
    }
}
