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
    String month = "08";
    String day = "05";
    String year = "2015";
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    dateFormat.setLenient(false);
    Date inputDate = dateFormat.parse(day + "/" + month + "/" + year);
    Calendar cal = Calendar.getInstance();
    cal.setTime(inputDate);
    String dayOfWeek = cal.getDisplayName (Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase ();
    System.out.println (dayOfWeek);
}


