
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numba = 0, sum = 0, count = 0;
        String name = "";
        while(true){
            String value = scanner.nextLine();
            if(value.equals("")){
                break;
            }
            String[] splitting = value.split(",");
            int nameLength = splitting[0].length();
            if(nameLength > numba){
                numba = nameLength;
                name = splitting[0];
            }
            int value2 = Integer.valueOf(splitting[1]);
            sum += value2;
            count++;            
        }
        double avg = 1.0 * sum / count;
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + avg);
    }
}
