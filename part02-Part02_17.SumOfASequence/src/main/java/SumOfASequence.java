
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Last number?");
        int lastNumber = scanner.nextInt();
        int sum = 0, seq = 0;
        //for loop
        for(int i = 1; i<=lastNumber;i++ ){
            seq += i;
        }
        System.out.println("The sum is " + seq);                        

    }
}
