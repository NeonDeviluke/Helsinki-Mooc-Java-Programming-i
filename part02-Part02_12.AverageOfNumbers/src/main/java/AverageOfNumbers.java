
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number = 0;
        double average;
        while(true){
            System.out.println("Give a number: ");
            int value = Integer.valueOf(scanner.nextLine());
            if(value == 0){
                average = (double) sum / number;
                System.out.println(average);
                System.out.println("Average of the numbers: " + average);
                break;
            }
            number = number + 1;
            sum = sum + value;
        }

    }
}
