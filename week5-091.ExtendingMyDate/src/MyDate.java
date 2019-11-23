
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }
        if (this.month < compared.month) {
            return true;
        }
        if (this.day < compared.day) {
            return true;
        }

        return false;
    }

    public void advance() {
        if (this.day < 30) {
            this.day++;
        } else {
            if (this.month < 12) {
                this.month++;
                this.day=1;
            } else {
                this.year++;
                this.day=1;
                this.month=1;
            }
        }
    }

    public void advance(int numberOfDays) {
        for (int i = 0; i < numberOfDays; i++) {
            this.advance();
        }
    }
    
    public MyDate afterNumberOfDays(int days){
        MyDate temp = new MyDate(this.day, this.month, this.year);
        temp.advance(days);
        return temp;
    }
}