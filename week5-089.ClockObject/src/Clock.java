
public class Clock {

    private BoundedCounter hours;
    private BoundedCounter minutes;
    private BoundedCounter seconds;

    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
        this.hours = new BoundedCounter(24);
        this.minutes = new BoundedCounter(59);
        this.seconds = new BoundedCounter(59);
        this.hours.setValue(hoursAtBeginning);
        this.minutes.setValue(minutesAtBeginning);
        this.seconds.setValue(secondsAtBeginning);
    }

    public void tick() {
        if (seconds.getValue() == 59) {
            if (minutes.getValue() == 59) {
                if (hours.getValue() == 23) {
                    hours.setValue(0);
                } else {
                    hours.next();
                }
            }
            minutes.next();
            seconds.next();
        } 
        else {
            seconds.next();
        }

    }

    public String toString() {
        return this.hours + ":" + this.minutes + ":" + this.seconds;
    }
}
