import java.util.*;

public class RecipeList {
    private String name;
    private int time;
    private ArrayList<String> ingredients;
    
    public RecipeList(String name, int time, ArrayList<String> ingredients){
        this.name = name;
        this.time = time;
        this.ingredients = ingredients;
    }
    
    public String getName(){
        return name;
    }
    
    public int getTime(){
        return time;
    }
    
    public ArrayList<String> getIngredients(){
        return ingredients;
    }
    
    public String toString(){
        return this.getName() + ", cooking time: " +  this.getTime();
    }
}
