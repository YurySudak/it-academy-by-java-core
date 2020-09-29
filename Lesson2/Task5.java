package Lesson2;

public class Task5 {
    public static void main(String[] args) {
        int timeInSeconds = 1234567;
        final int MINUTE = 60;
        final int HOUR = MINUTE*60;
        final int DAY = HOUR*24;
        final int WEEK = DAY*7;
        int weeks = timeInSeconds / WEEK;
        int remainingTimeInSeconds = timeInSeconds % WEEK;
        int days = timeInSeconds / DAY;
        remainingTimeInSeconds %= DAY;
        int hours = remainingTimeInSeconds / HOUR;
        remainingTimeInSeconds %= HOUR;
        int minutes = remainingTimeInSeconds / MINUTE;
        int seconds = remainingTimeInSeconds % MINUTE;
        System.out.println("Недель: " + weeks + ", суток: " + days + ", часов: " + hours + ", минут: " + minutes + ", секунд: " + seconds);
    }
}
