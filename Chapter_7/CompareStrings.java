import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name > ");
        String userInput = scanner.nextLine();

        String predefined = "Carmen";

        if (userInput.equals(predefined)) {
            System.out.println(predefined + " equals " + userInput);
        } else {
            System.out.println(predefined + " does not equal " + userInput);
        }

        scanner.close();
    }
}