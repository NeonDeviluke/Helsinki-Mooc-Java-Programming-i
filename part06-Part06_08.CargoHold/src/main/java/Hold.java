import java.util.*;
public class Hold {
    private int maxweight;
    private ArrayList<Suitcase> suitcases;
    private int count;
    
    public Hold(int maximumWeight){
        this.maxweight = maximumWeight;
        this.suitcases = new ArrayList<>();
        this.count = 0;
    }
    
    public void addSuitcase(Suitcase suitcase){
        count = this.totalWeight() + suitcase.totalWeight();
        System.out.println(count);
        if(count <= this.maxweight){
            this.suitcases.add(suitcase);
        }
    }
    
    public int totalWeight(){
        int value = 0;
        for(Suitcase valu : suitcases){
            value += valu.totalWeight();
        }
        return value;
    }
    
    
    public void printItems(){
        for(Suitcase names : suitcases){
            names.printItems();
        }        
    }
    
    public String toString(){
        int value = 0;
        for(Suitcase valu : suitcases){
            value += valu.totalWeight();
        }
        return suitcases.size() + " suitcases" + "(" + value + " kg)";        
    }
}
