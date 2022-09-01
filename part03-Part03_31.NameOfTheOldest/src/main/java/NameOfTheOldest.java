
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numba = 0;
        String you = "";
        while(true){
            String value = scanner.nextLine();
            if(value.equals("")){
                break;
            }
            String[] splitting = value.split(",");
            int input = Integer.valueOf(splitting[1]);
            if(input > numba){
                numba = input;
                you = splitting[0];
            }                
        }
        System.out.println("Name of the oldest: " + you);
    }
}
