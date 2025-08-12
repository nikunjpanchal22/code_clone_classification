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


 public String getNextMonth (boolean maxDate) {
    Calendar cal = Calendar.getInstance();
    cal.set(year, monthNo + 1, 1);
    if (maxDate) {
        int maxD = cal.getActualMaximum (Calendar.DAY_OF_MONTH);
        cal.set (Calendar.DAY_OF_MONTH, maxD);
    } else { 
        cal.set(Calendar.DAY_OF_MONTH, day);
    }
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    return sdf.format(cal.getTime());
}


