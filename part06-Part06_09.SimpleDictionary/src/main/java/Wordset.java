import java.util.Scanner;
public class Wordset {
    private Scanner scanner;
    private SimpleDictionary dict;
    
    public Wordset(Scanner scanner, SimpleDictionary dict){
        this.scanner = scanner;
        this.dict = dict;
    }
    
    public boolean end(String value){
        return value.equals("end");
    }
    
    public void add(){
        System.out.println("Word:");
        String word = scanner.nextLine();
        System.out.println("Translation:");
        String trans = scanner.nextLine();
        this.dict.add(word, trans);
    }
    
    public void search(){
        System.out.println("To be transulated:");
        String trans1 = scanner.nextLine();
        System.out.println("Translation:");
        if(dict.translate(trans1) == null){
            System.out.println("Word " + trans1 + " was not found");
        }else{
            System.out.println(dict.translate(trans1));
        }
    }
}