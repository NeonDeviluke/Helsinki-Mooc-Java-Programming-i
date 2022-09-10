import java.util.*;
public class Room {
    private ArrayList<Person> ferson;
    
    public Room(){
        this.ferson = new ArrayList<>();
    }
    
    public void add(Person person){
        this.ferson.add(person);
    }
    
    public boolean isEmpty(){
        if(this.ferson.isEmpty()){
            return true;
        }
        return false;
    }
    
    public ArrayList<Person> getPersons(){
        return this.ferson;
    }
    
    public Person take(){
        Person menu = this.shortest();
        this.ferson.remove(menu);
        return menu;
    }
    
    public Person shortest(){
        if(this.ferson.isEmpty()){
            return null;
        }
        Person man = this.ferson.get(0);
        for(Person value : ferson){
            if(man.getHeight() > value.getHeight()){
                man = value;
            }
        }
        return man;
    }
}
