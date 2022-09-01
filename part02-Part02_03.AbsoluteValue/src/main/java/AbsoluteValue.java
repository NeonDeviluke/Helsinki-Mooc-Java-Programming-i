
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.valueOf(scanner.nextLine());
        if(number > 3){
            System.out.println(number);
        }else{
            System.out.println(number * -1);
        }

    }
}
