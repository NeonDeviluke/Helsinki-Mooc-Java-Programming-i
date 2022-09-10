import java.util.*;

public class Birdit {
    private ArrayList<BirdDatabase> birdinfo;
    
    public Birdit(){
        this.birdinfo = new ArrayList<>();
    }

    public ArrayList<BirdDatabase> getBirdInfo(){
        return this.birdinfo;
    }
    
    public void addingData(String name, String latinName){
        this.birdinfo.add(new BirdDatabase(name, latinName));
    }
    
    public int Observations(String name){
        int count = 0;
        for(BirdDatabase obs : birdinfo){
            if(obs.getName().equals(name)){
                obs.addObservation();
            }else{
                count++;
            }
        }        
        if(count == birdinfo.size()){
            return -1;
        }
        return count;
    }
    
    public void printAll(){
        for(BirdDatabase value: birdinfo){
            System.out.println(value);
        }
    }
    
    public void printOne(String name){
        for(BirdDatabase one: birdinfo){
            if(one.getName().equals(name)){
                System.out.println(one);
            }
        }
    }
    
}
