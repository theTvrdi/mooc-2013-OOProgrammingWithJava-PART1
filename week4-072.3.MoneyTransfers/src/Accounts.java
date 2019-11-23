
public class Accounts {

    public static void main(String[] args)
    {
        Account prvi = new Account("A", 100.0);
        Account drugi = new Account("B", 0.0);
        Account treci = new Account("C", 0.0);
        transfer(prvi, drugi, 50.0);
        transfer(drugi, treci, 25.0);
    }
    
    public static void transfer(Account from, Account to, double howMuch)
    {
        from.withdrawal(howMuch);
        to.deposit(howMuch);
    }

}