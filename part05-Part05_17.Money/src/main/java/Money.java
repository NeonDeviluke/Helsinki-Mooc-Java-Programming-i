
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    
    public Money plus(Money addition){
        int aeuros = this.euros + addition.euros;
        int acents = this.cents + addition.cents;
        if (acents > 99) {
            aeuros = aeuros + acents / 100;
            acents = acents % 100;
        }
        Money newMoney = new Money(aeuros,acents);
        return newMoney;
    }
    
    public boolean lessThan(Money compared){
        if(this.euros < compared.euros){
            return true;
        }else if(this.euros == compared.euros){
            if(this.cents < compared.cents){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }            
    }
    
    public Money minus(Money decreaser){
        int beuros = this.euros - decreaser.euros;
        System.out.println(beuros);
        int bcents = this.cents - decreaser.cents;
        
        if(bcents < 0){
            beuros = beuros - 1;
            bcents = 100 + bcents;
        }
        
        if(beuros < 0 ){
            beuros = 0;
            bcents = 0;
        }
        
        Money newMoney = new Money(beuros,bcents);
        return newMoney;
    }
}
