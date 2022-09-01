
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int stop = scanner.nextInt();
        divisibleByThreeInRange(start,stop);

    }
    public static void divisibleByThreeInRange(int beginning, int end){
        int i = 0;
        if (beginning < 3){
            i = 3;
        }else{
            i = beginning % 3;
            i += beginning;
        }
        while(i <= end){
            System.out.println(i);
            i+=3;
        }
    }

}
