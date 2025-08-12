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
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
    LocalDate parsedDate = LocalDate.parse("08/05/2015", formatter);
    DayOfWeek dow = parsedDate.getDayOfWeek();
    System.out.println(dow.getDisplayName(TextStyle.FULL, Locale.US).toUpperCase());
}


