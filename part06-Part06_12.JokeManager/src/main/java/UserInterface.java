import java.util.Scanner;

public class UserInterface {
    private JokeManager manager;
    private Scanner scanner;
    
    public UserInterface(JokeManager manager, Scanner scanner){
        this.manager = manager;
        this.scanner = scanner;
    }
    
    public void start(){
        while(true){
            System.out.println("Commands:");
            String value = scanner.nextLine();
            
            if(value.equals("X")){
                break;
            }
            
            if(value.equals("1")){
                System.out.println("Write the joke to be added:");
                String str1 = scanner.nextLine();
                manager.addJoke(str1);
            }
            
            if(value.equals("2")){
                System.out.println("Drawing the jokes.");
                System.out.println(manager.drawJoke());
            }
            
            if(value.equals("3")){
                System.out.println("Printing the jokes.");
                manager.printJokes();
            }
        }
    }
    
    
}
