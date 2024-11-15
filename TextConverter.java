import java.util.Scanner;

public class TextConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder finalText = new StringBuilder();
        int changes = 0;

        System.out.println("Enter text one character at a time (type '.' to finish):");

        while (true) {
            String input = scanner.nextLine();
            if (input.length() != 1) {
                System.out.println("Please enter only one character.");
                continue;
            }
            char character = input.charAt(0);

            if (character == '.') {
                finalText.append('.');
                break;
            }

            if (Character.isUpperCase(character)) {
                finalText.append((char) (character + 32));
                changes++;
            } else if (Character.isLowerCase(character)) {
                finalText.append((char) (character - 32));
                changes++;
            } else {
                finalText.append(character);
            }
        }

        System.out.println("\nConverted text:");
        System.out.println(finalText);
        System.out.println("Number of changes made: " + changes);

        scanner.close();
    }
}
