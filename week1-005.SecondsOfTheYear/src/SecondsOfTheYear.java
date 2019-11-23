
public class SecondsOfTheYear {

    public static void main(String[] args) {
        // In below an incomplete version of the program. Please complete it!

        int daysInYear = 365;
        int hoursInDay = 0;
        int minutesInHour = 0;
        int secondsInMinute = 0;
        int secondsInYear = daysInYear * hoursInDay;
        
        hoursInDay = 24;
        minutesInHour = 60;
        secondsInMinute = minutesInHour;
        secondsInYear = daysInYear * hoursInDay * minutesInHour * secondsInMinute;
        
        System.out.println("There are " + secondsInYear + " seconds in a year");
    }

}
