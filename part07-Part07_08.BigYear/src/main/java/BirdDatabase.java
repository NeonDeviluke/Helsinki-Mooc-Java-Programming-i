/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mpnis
 */
public class BirdDatabase {
    private String name;
    private String latinName;
    private int observation;
    
    public BirdDatabase(String name, String latinName){
        this.name = name;
        this.latinName = latinName;
        this.observation = 0;
    }

    BirdDatabase() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getlatinName(){
        return this.latinName;
    }
    
    public void addObservation(){
       this.observation++;
    }
    
    public int getObservation(){
        return this.observation;
    }

    public String toString() {
        return this.name + " (" + this.latinName + "): " + getObservation() + " observations";
    }
    
    
}
