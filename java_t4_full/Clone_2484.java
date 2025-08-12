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





public static void main(String[] args) throws ParseException {
    SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy", Locale.US);
    String dateInString = "08/05/2015";
    Date date = formatter.parse(dateInString);
    SimpleDateFormat sdf = new SimpleDateFormat("EEEE", Locale.US);
    System.out.println(sdf.format(date).toUpperCase());
}


