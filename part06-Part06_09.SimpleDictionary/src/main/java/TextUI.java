import java.util.Scanner;
public class TextUI {
    private Scanner scanner;
    private Wordset words;
    
    public TextUI(Scanner scanner, Wordset words){
        this.scanner = scanner;
        this.words = words;
    }
    
    public void start(){
        while(true){
            System.out.println("Command:");
            String value = scanner.nextLine();
            
            if(value.equals("end")){
                System.out.println("Bye bye!");
                break;
            }
            
            if(value.equals("add")){
                words.add();
            }
            
            if(value.equals("search")){
                words.search();
            }
            
            System.out.println("Unknown command");
        }
    }
}
