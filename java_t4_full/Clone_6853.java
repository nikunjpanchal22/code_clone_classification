public static void main (String [] args) throws ParseException {
    String st1 = "2015-07-24T09:39:14.000Z";
    String st2 = "2015-07-24T09:45:44.000Z";
    String time1 = st1.substring (st1.indexOf ("T") + 1, st1.indexOf (".0"));
    String time2 = st2.substring (st2.indexOf ("T") + 1, st2.indexOf (".0"));
    Date dateTime1 = new java.text.SimpleDateFormat ("HH:mm").parse (time1);
    Date dateTime2 = new java.text.SimpleDateFormat ("HH:mm").parse (time2);
    System.out.println (dateTime1.after (dateTime2));
}




import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        String st1 = "2015-07-24T09:39:14.000Z";
        String st2 = "2015-07-24T09:45:44.000Z";

        LocalDateTime dateTime1 = LocalDateTime.parse(st1, DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'"));
        LocalDateTime dateTime2 = LocalDateTime.parse(st2, DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'"));

        System.out.println(dateTime1.isBefore(dateTime2));
    }
}


