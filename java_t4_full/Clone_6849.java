public static void main (String [] args) throws ParseException {
    String st1 = "2015-07-24T09:39:14.000Z";
    String st2 = "2015-07-24T09:45:44.000Z";
    String time1 = st1.substring (st1.indexOf ("T") + 1, st1.indexOf (".0"));
    String time2 = st2.substring (st2.indexOf ("T") + 1, st2.indexOf (".0"));
    Date dateTime1 = new java.text.SimpleDateFormat ("HH:mm").parse (time1);
    Date dateTime2 = new java.text.SimpleDateFormat ("HH:mm").parse (time2);
    System.out.println (dateTime1.after (dateTime2));
}


 

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        String st1 = "2015-07-24T11:27:14.000Z";
        String st2 = "2015-07-24T12:45:44.000Z";
        String time1 = st1.split("T")[1].split("\\.")[0];
        String time2 = st2.split("T")[1].split("\\.")[0];

        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        Date dateTime1 = sdf.parse(time1);
        Date dateTime2 = sdf.parse(time2);

        if(dateTime1.getTime() < dateTime2.getTime()) {
            System.out.println("st1 is before than st2");
        } else if(dateTime1.getTime() > dateTime2.getTime()) {
            System.out.println("st1 is after than st2");
        } else {
            System.out.println("st1 is equal to st2");
        }
    }
}


