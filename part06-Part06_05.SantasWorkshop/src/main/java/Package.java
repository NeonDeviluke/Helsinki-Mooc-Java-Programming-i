import java.util.*;
public class Package {
    private ArrayList<Gift> gifts;
    
    public Package(){
        this.gifts = new ArrayList<>();
    }
    
    public void addGift(Gift gift){
        this.gifts.add(gift);
    }
    
    public int totalWeight(){
        int wei = 0;
        for(Gift value : gifts){
           wei += value.getWeight();
        }
        return wei;
    }
    
}
