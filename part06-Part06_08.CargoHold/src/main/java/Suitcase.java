import java.util.*;
public class Suitcase {
    private int maxweight;
    private ArrayList<Item> items;
    
    public Suitcase(int maximumWeight){
        this.maxweight = maximumWeight;
        this.items = new ArrayList<>();
    }
    
    public void addItem(Item item){
        int count = this.totalWeight() + item.getWeight();
        if(count <= this.maxweight ){
            this.items.add(item);
        }
    }
    
    public void printItems(){
        for(Item names : items){
            System.out.println(names.getName() + "(" + names.getWeight() + " kg)");
        }
    }
    
    public int totalWeight(){
        int value = 0;
        for(Item valu : items){
            value += valu.getWeight();
        }
        return value;
    }
    
    public Item heaviestItem(){
        if(items.isEmpty()){
            return null;
        }
        Item helloo = this.items.get(0);
        for(Item mole : items){
            if(helloo.getWeight() < mole.getWeight()){
                helloo = mole;
            }
        }
        return helloo;
    }
    
    public String toString() {
        int value = 0;
        for(Item valu : items){
            value += valu.getWeight();
        }
        if(items.isEmpty()){
            return "no items " + "(" + value + " kg)";
        }
        
        if(items.size() == 1){
            return items.size() + " item " + "(" + value + " kg)";
        }
        
        return items.size() + " items " + "(" + value + " kg)";
    }

}
