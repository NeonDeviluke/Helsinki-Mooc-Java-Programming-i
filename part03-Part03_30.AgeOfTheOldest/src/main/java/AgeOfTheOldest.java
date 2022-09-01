
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numba = 0;
        int count = 0;
        String you = "";
        while(true){
            String value = scanner.nextLine();
            if(value.equals("")){
                break;
            }
            String[] splitting = value.split(",");
            int input = Integer.valueOf(splitting[1]);
            if(count == 0){
                numba = input;
            }else{
                if(input > numba){
                    numba = input;
                    you = splitting[0];
                }
            }
            count++;
        }
        System.out.println("Age of the oldest: " + you);
    }
}
