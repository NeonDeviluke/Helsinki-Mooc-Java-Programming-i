
public class Archive {
    private String identifier;
    private String name;
    
    public Archive(String identifier, String name){
        this.identifier = identifier;
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getIdentifier(){
        return this.identifier;
    }
    
    public boolean equals(Object compared){
        if(this == compared){
            return true;
        }
        
        if(!(compared instanceof Archive)){
            return false;
        }
        
        Archive newcompared = (Archive) compared;
        
        if(this.identifier.equals(newcompared.identifier)){
            return true;
        }
        return false;
    }
}
