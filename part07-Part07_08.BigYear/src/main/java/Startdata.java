import java.util.Scanner;

public class Startdata {
    private Birdit bird;
    
    public Startdata(){
        this.bird = new Birdit();
    }
    
    public void start(Scanner scanner){
        while(true){
            System.out.println("?");
            String input = scanner.nextLine();
            
            if(input.equals("Quit")){
                break;
            }
            
            if(input.equals("Add")){
                System.out.println("Name: ");
                String name = scanner.nextLine();
                System.out.println("Name in Latin: ");
                String latinName = scanner.nextLine();
                bird.addingData(name, latinName);
            }
            
            if(input.equals("Observation")){
                System.out.println("Bird");
                String birdname = scanner.nextLine();
                if(bird.Observations(birdname) == -1){
                    System.out.println("Not a bird!");
                }
            }
            
            if(input.equals("All")){
                bird.printAll();
            }
            
            if(input.equals("One")){
                System.out.println("Bird?");
                String birdName = scanner.nextLine();
                bird.printOne(birdName);
            }
        }        
    }    
}
