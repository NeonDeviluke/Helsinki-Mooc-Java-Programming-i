
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String value = scanner.nextLine();
            if(value.equals("")){
                break;
            }
            String[] splitting = value.split(" ");
            System.out.println(splitting[splitting.length -1]);
        }


    }
}
