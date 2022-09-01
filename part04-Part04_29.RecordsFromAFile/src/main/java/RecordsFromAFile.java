
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file: ");
        String value = scanner.nextLine();
        try(Scanner banner = new Scanner(Paths.get(value))){
            while(banner.hasNextLine()){
                String line = banner.nextLine();
                String[] are = line.split(",");
                String name = are[0];
                String age = are[1];
                if(age.equals(1)){
                    System.out.println(name + ", age: " + age + " year" );
                }else{
                    System.out.println(name + ", age: " + age + " years" );                    
                }
            }
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
