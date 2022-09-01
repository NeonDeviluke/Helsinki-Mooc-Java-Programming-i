
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        ArrayList<Integer> integer = new ArrayList<>();
        while(true){
            int input = scanner.nextInt();
            if(input == 9999){
                break;
            }                        
            integer.add(input);
        }
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        int smallest = integer.get(0);
        for(int i = 1; i < integer.size(); i++){
            if(integer.get(i) < smallest){
                smallest = integer.get(i);
            }
        }
        System.out.println("Smallest number: " + smallest);
        for(int i = 0; i < integer.size(); i++){
            if(smallest == integer.get(i)){
                System.out.println("Found at index: " + i);
            }
        }        
    }
}
