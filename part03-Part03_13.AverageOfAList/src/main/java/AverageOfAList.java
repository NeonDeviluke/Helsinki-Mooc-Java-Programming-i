
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        ArrayList<Integer> numbers = new ArrayList<>();
        while(true){
            int value = scanner.nextInt();
            if(value == -1){
                break;
            }
            numbers.add(value);
        }
        // Then it computes the average of the numbers on the list
        // and prints it.
        int value = 0, num = 0;
        for(Integer sum : numbers){
            value += sum;
            num++;
        }
        double avg = 1.0 * value / num;
        System.out.println("Average: " + avg);
    }
}
