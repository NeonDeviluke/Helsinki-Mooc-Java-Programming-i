
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number?");
        int firstNumber = scanner.nextInt();
        System.out.println("Last number?");
        int lastNumber = scanner.nextInt();
        int sum = 0, seq = 0;
        //for loop
        for(int i = firstNumber; i<=lastNumber; i++ ){
            seq += i;
        }
        System.out.println("The sum is " + seq);

    }
}
