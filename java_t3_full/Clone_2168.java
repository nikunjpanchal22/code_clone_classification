public static void main (String [] args) throws ParseException {
    String st1 = "2015-07-24T09:39:14.000Z";
    String st2 = "2015-07-24T09:45:44.000Z";
    String time1 = st1.substring (st1.indexOf ("T") + 1, st1.indexOf (".0"));
    String time2 = st2.substring (st2.indexOf ("T") + 1, st2.indexOf (".0"));
    Date dateTime1 = new java.text.SimpleDateFormat ("HH:mm").parse (time1);
    Date dateTime2 = new java.text.SimpleDateFormat ("HH:mm").parse (time2);
    System.out.println (dateTime1.after (dateTime2));
}


 public static void main (String [] args) throws ParseException {
    //Parse the String
	String st1 = "2015-07-24T09:39:14.000Z";
	String st2 = "2015-07-24T09:45:44.000Z";

    //Create substrings for each of the datetimes
	String time1 = st1.substring(st1.indexOf("T") + 1, st1.indexOf(".0"));
	String time2 = st2.substring(st2.indexOf("T") + 1, st2.indexOf(".0"));

    //Create ZonedDateTime objects for each of the datetimes
	ZonedDateTime dateTime1 = ZonedDateTime.parse(time1);
	ZonedDateTime dateTime2 = ZonedDateTime.parse(time2);

    //Compare two ZonedDateTime objects
	System.out.println (dateTime1.isAfter(dateTime2));
}


