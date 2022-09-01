
import static java.lang.Math.abs;


public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;
    private int price;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
        this.price = 0;
    }

    public boolean largerThan(Apartment compared){
        if(this.squares > compared.squares){
            return true;
        }
        return false;
    }
    
    public int getPrice(){
        this.price = this.squares * this.princePerSquare;
        return this.price;
    }
    
    public int priceDifference(Apartment compared){
        return abs(getPrice() - compared.getPrice());
    }
    
    public boolean moreExpensiveThan(Apartment compared){        
        return getPrice() > compared.getPrice() ? true : false;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
