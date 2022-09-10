
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Program {
    
    public static void main(String[] args) {
        JokeManager manager = new JokeManager();
        Scanner scanner = new Scanner(System.in);
        
        manager.addJoke("just joking 1");
        manager.addJoke("just joking 2");
        manager.addJoke("just joking 3");
        
        UserInterface ui = new UserInterface(manager, scanner);
        ui.start();
    }
}
