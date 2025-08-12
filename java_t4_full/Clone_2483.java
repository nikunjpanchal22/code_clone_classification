public static void main (String [] args) throws ParseException {
    String month = "08";
    String day = "05";
    String year = "2015";
    String inputDateStr = String.format ("%s/%s/%s", day, month, year);
    Date inputDate = new SimpleDateFormat ("dd/MM/yyyy").parse (inputDateStr);
    Calendar calendar = Calendar.getInstance ();
    calendar.setTime (inputDate);
    String dayOfWeek = calendar.getDisplayName (Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase ();
    System.out.println (dayOfWeek);
}





public static void main (String [] args) throws ParseException {
    SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
    String strDate = "08/05/2015";
    Date date = format.parse(strDate);
    format.applyPattern("EEEE");
    String finalDay = format.format(date);
    System.out.println(finalDay.toUpperCase());
}


