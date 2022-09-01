
public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000;
    }

    public double eatAffordably(double payment) {
        if(payment >= 2.50){
            payment = payment - 2.50;
            this.money += 2.50;
            affordableMeals++;
        }
        return payment;
    }

    public double eatHeartily(double payment) {
        if(payment >= 4.30){
            payment -= 4.30;
            this.money += 4.30;
            heartyMeals++;
        }
        return payment;
    }
    
    public boolean eatAffordably(PaymentCard card){
        if(card.balance() - 2.50 >= 0){
            card.takeMoney(2.50);
            affordableMeals++;
            return true;
        }
        return false;
    }
    
    public boolean eatHeartily(PaymentCard card){
       if(card.balance() - 4.30 >= 0){
            card.takeMoney(4.30);
            heartyMeals++;
            return true;
       }
       return false;
    }
    
    public void addMoneyToCard(PaymentCard card, double sum){
        if(sum > 0){
            card.addMoney(sum);
            money = money + sum;
        }
    }


    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}




