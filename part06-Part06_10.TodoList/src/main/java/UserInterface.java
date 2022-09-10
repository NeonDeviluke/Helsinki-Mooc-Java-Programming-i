import java.util.Scanner;
public class UserInterface {
    private TodoList doit;
    private Scanner scanner;
    
    public UserInterface(TodoList doit, Scanner scanner){
        this.doit = doit;
        this.scanner = scanner;
    }
    
    public void start(){
        while(true){
            System.out.println("Command:");
            String value = scanner.nextLine();
            
            if(value.equals("stop")){
                break;
            }
            
            if(value.equals("add")){
                System.out.println("To add:");
                String str1 = scanner.nextLine();
                doit.add(str1);
            }
            
            if(value.equals("list")){
                doit.print();
            }
            
            if(value.equals("remove")){
                System.out.println("Which one is removed?");
                int number = scanner.nextInt();
                doit.remove(number);
            }
        }
    }
}
