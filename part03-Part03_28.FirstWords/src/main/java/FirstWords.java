
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String value = scanner.nextLine();
            if(value.equals("")){
                break;
            }
            String[] given = value.split(" ");
            System.out.println(given[0]);
        }


    }
}
