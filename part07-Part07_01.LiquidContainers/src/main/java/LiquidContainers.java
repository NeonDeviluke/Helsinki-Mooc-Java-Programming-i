
import java.util.Scanner;

public class LiquidContainers {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0, second = 0;
        
        while (true) {
            System.out.print("> ");
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            int value = Integer.valueOf(parts[1]);
            
            if(parts[0].equals("add")){
                if(value >= 0){
                    if(first + value > 100){
                        first = 100;
                    }else{
                        first = first + value;
                    }
                }
            }
            
            if(parts[0].equals("move")){
                if(value >= first && first > 0){
                    if(second + value > 100){
                        second = 100;
                        first = 0;
                    }else if(value > first && first - value < 0){
                        second += first;
                        first = 0;
                    }else{
                        second += value;
                        first = 0;
                    }
                }else if(value < first && first > 0){
                    if(second + value > 100){
                        second = 100;
                        first -= value;
                    }else{
                        second += value;
                        first -= value;
                    }
                }
            }
            
            if(parts[0].equals("remove")){
                if(value >= 0){
                    if(second - value < 0){
                        second = 0;
                    }else{
                        second = second - value;
                    }
                }
            }
        }
        
    }
}