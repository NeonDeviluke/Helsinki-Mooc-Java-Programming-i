
public class Container {
    private int first;
    
    public Container() {
        this.first = 0;
    }
    
    public int contains(){
        return this.first;
    }
    
    public void add(int amount){
        if(amount >= 0){
            first = first + amount;
            if (first > 100) {
                first = 100;
            }
        }
    }
    
    public void remove(int amount){
        if(amount >= 0){
            first = first- amount;
            if (first < 0) {
                first = 0;
            }
        }
    }
    
    
    public String toString(){
        return first + "/100" ;
    }
}
