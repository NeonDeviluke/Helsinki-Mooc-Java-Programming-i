
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which file should have its contents printed?");
        String value = scanner.nextLine();
        try (Scanner banner = new Scanner(Paths.get(value))){
            while(banner.hasNextLine()){
                String row = banner.nextLine();
                System.out.println(row);
            }
        }catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
