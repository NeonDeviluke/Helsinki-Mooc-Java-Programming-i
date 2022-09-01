
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a word: ");
        String value = scanner.nextLine();
        String newValue = value + value + value;
        System.out.println(newValue);
    }
}

