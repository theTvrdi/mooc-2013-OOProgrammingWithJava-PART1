/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thetv
 */
public class LyyraCard {

    private double balance;

    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;
    }
    
    @Override
    public String toString () {
        return ("The card has " + balance + " euros");
    }

    public void payEconomical() {
        if (this.balance >= 2.50) {
            this.balance -= 2.50;
        }

    }

    public void payGourmet() {
        if (this.balance >= 4.00) {
            this.balance -= 4.00;
        }
    }

    public void loadMoney(double loaded) {
        if (loaded >= 0) {
            this.balance += loaded;
            if (this.balance > 150.00) {
                this.balance = 150.00;
            }
        }
    }
}
