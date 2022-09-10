
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString(){
        String puta = "The collection "+ this.name+ " has " + this.elements.size() +" element:";
        
        if(this.elements.size() == 0){
            return "The collection " + this.name + " is empty.";
        }
        
        String number = "";
        for(String value : elements){
            number = number + value;
        }
        
        
        if(this.elements.size() > 1){
            String putas = "The collection "+ this.name+ " has " + this.elements.size() +" elements:";
            String dumber = "";
            for(String value : elements){
                dumber = dumber + value + "\n" ;
            }            
            return putas + "\n" + dumber;
        }
        return puta + "\n" + number;
    }
}
