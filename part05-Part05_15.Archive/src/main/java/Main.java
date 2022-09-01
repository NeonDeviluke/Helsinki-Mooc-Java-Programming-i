
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> archives = new ArrayList<>();
        while(true){
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if(identifier.equals("")){
                break;
            }
            
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if(name.equals("")){
                break;
            }
            
            Archive lists = new Archive(identifier,name);
            if(archives.contains(lists)){
            }else{
                archives.add(lists); 
            }
        }
        for(Archive value : archives){
            System.out.println( value.getIdentifier() + ": " + value.getName());
        }        

    }
}
