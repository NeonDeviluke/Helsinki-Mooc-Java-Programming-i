
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
           String value = scanner.nextLine();
           if(value.equals("")){
               break;
           }
           for(String input : value.split(" ")){
                if(input.contains("av")){
                    System.out.println(input);
                }
           }
        }


    }
}
