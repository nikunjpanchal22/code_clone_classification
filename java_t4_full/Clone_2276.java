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
	String time1_startIndex = st1.indexOf("T") + 1;
	int startIndex = Integer.parseInt(time1_startIndex);
	String time1_endIndex = st1.indexOf(".0");
	int endIndex = Integer.parseInt(time1_endIndex);
	String time1 = st1.substring(startIndex, endIndex);

	String time2_startIndex = st2.indexOf("T") + 1;
	int startIndex2 = Integer.parseInt(time2_startIndex);
	String time2_endIndex = st2.indexOf(".0");
	int endIndex2 = Integer.parseInt(time2_endIndex);
	String time2 = st2.substring(startIndex2, endIndex2);

    //Create Date objects for each of the datetimes
	Date dateTime1 = new java.text.SimpleDateFormat ("HH:mm").parse (time1);
	Date dateTime2 = new java.text.SimpleDateFormat ("HH:mm").parse (time2);

    //Compare two Date objects
	System.out.println (dateTime1.after (dateTime2));
}


