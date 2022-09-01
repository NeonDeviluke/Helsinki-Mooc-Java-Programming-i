
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        Account neonsAccount = new Account("Neon's account", 100.00);

        System.out.println("Initial state");
        System.out.println(neonsAccount);

        neonsAccount.deposit(20);
        System.out.println("The balance of Arto's account is now: " + neonsAccount.saldo());
            

        System.out.println("End state");
        System.out.println(neonsAccount);
    }
}
