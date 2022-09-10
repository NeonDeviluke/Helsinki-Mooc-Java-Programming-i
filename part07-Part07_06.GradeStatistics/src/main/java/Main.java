import java.util.*;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here -- consider breaking the program into
        // multiple classes.
        ArrayList<Integer> values = new ArrayList<>();
        System.out.println("Enter point totals, -1 stops:");
        while(true){
            int input = scanner.nextInt();
            if(input == -1){
                break;
            }
            
            if(input >= 0 && input <= 100){
                values.add(input);
            }
        }
        GradingDistribution blades = new GradingDistribution(values);
        GradeStatistics grades = new GradeStatistics(blades, values);
        grades.averages();
        grades.passingAverage();
        grades.dades();
    }
}
