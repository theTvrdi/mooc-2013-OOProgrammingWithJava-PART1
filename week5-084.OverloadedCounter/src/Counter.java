/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thetv
 */
public class Counter {

    private int num;
    private boolean check;

    public Counter(int startingValue, boolean check) {
        this.num = startingValue;
        this.check = check;
    }

    public Counter(int startingValue) {
        this.num = startingValue;
        this.check = false;
    }

    public Counter(boolean check) {
        this.num = 0;
        this.check = check;
    }

    public Counter() {
        this.num = 0;
        this.check = false;
    }

    public int value() { 
        return this.num;
    }

    public void increase() {
        this.num++;
    }
    
    public void increase(int ab){
        if(ab>0) this.num+=ab;
    }
            
    public void decrease() {
        if (this.check == false) {
            this.num--;
        } else {
            if (this.num > 0) {
                this.num--;
            }
        }
    }
    
    public void decrease(int ab) {
        if(ab<0) return;
        if (this.check == false) {
            this.num-=ab;
        } else {
            if (this.num-ab>0) {
                this.num-=ab;
            }
            else this.num=0;
        }
    }
}

