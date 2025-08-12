public String getNextMonth (boolean maxDate) {
    Calendar calendar = Calendar.getInstance ();
    calendar.set (year, monthNo, 1);
    calendar.add (Calendar.MONTH, 1);
    if (maxDate) {
        int maxD = calendar.getActualMaximum (Calendar.DAY_OF_MONTH);
        calendar.set (Calendar.DAY_OF_MONTH, maxD);
    } else {
        calendar.set (Calendar.DAY_OF_MONTH, day);
    }
    String date = (calendar.get (Calendar.YEAR)) + "-" + (calendar.get (Calendar.MONTH) + 1) + "-" + calendar.get (Calendar.DAY_OF_MONTH);
    calendar.clear ();
    return date;
}


public String getPreviousMonth (boolean minDate) {
    Calendar calendar = Calendar.getInstance ();
    calendar.set (year, monthNo, 1);
    calendar.add (Calendar.MONTH, -1);
    if (minDate) {
        int minD = calendar.getActualMinimum (Calendar.DAY_OF_MONTH);
        calendar.set (Calendar.DAY_OF_MONTH, minD);
    } else {
        calendar.set (Calendar.DAY_OF_MONTH, day);
    }
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    String date = dateFormat.format(calendar.getTime());
    calendar.clear ();
    return date;
}
