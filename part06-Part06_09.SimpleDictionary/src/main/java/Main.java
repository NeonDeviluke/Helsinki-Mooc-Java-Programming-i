
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Try out how the different parts of the program work together
        // here
        Scanner scanner = new Scanner(System.in);
        SimpleDictionary dictionary = new SimpleDictionary();

        Wordset ai = new Wordset(scanner, dictionary);
        TextUI ui = new TextUI(scanner, ai);
        ui.start();
        System.out.println(dictionary.translate("pike")); // prints the string "hauki"

    }
}
