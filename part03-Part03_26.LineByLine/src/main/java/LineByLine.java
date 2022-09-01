
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String value = scanner.nextLine();
            if(value.equals("")){
                break;
            }
            String[] input = value.split(" ");
            for(String input2 : input){
                System.out.println(input2);
            }
        }
        


    }
}
