
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");
        int fact = scanner.nextInt();
        int factorial = 1;
        if(fact == 0){
            System.out.println("Factorial: 1");
        }else{
            for(int i = 1; i <= fact; i++){
                factorial *= i;
            }
            System.out.println("Factorial: " + factorial);
        }

    }
}
