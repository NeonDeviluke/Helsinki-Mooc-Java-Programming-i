import java.util.*;

public class Stack {
    private ArrayList<String> stack;
    
    public Stack(){
        this.stack = new ArrayList<>();
    }
    
    public boolean isEmpty(){
       if(this.stack.isEmpty()){
           return true;
       }
       return false;
    }
    
    public void add(String value){
        this.stack.add(value);
    }
    
    public ArrayList<String> values(){
        return stack;
    }
    
    public String take(){
        String item = this.stack.get(this.stack.size() - 1);
        this.stack.remove(this.stack.size() - 1);
        return item;
    }
}
