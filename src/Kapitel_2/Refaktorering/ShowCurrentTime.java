package Kapitel_2.Refaktorering;

public class ShowCurrentTime {
    public static void main(String[] args) {

        long tid[] =tid() ;
        System.out.println("Klokken er  " + tid[2] + ":"
                + tid[1] + ":" + tid[0] + " GMT");
    }

    public static long[] tid() {
        // Obtain the total milliseconds since midnight, Jan 1, 1970
        long totalMilliseconds = System.currentTimeMillis();
        // Obtain the total seconds since midnight, Jan 1, 1970
        long totalSeconds = totalMilliseconds / 1000;
        // Compute the current second in the minute in the hour
        long currentSecond = totalSeconds % 60;
        // Obtain the total minutes
        long totalMinutes = totalSeconds / 60;
        // Compute the current minute in the hour
        long currentMinute = totalMinutes % 60;
        // Obtain the total hours
        long totalHours = totalMinutes / 60;
        // Compute the current hour
        long currentHour = totalHours % 24;
        // Display results
        long[] svar = new long[3];
        svar[0] = currentSecond;
        svar[1] = currentMinute;
        svar[2] = currentHour;
        //opsætter et array så jeg kan få alle tiderne ud af metoden
        return svar;
    }
}
