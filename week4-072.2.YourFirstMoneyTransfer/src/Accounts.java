
public class Accounts {

    public static void main(String[] args) {
        Account prvi=new Account("Matt's account", 1000);
        Account drugi=new Account("My account", 0);
        prvi.withdrawal(100.0);
        drugi.deposit(100.0);
        System.out.println(prvi);
        System.out.println(drugi);
    }

}
