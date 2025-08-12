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
    LocalDateTime dt = LocalDateTime.of(year, monthNo+1, 1, 0, 0);
    if(maxDate){
        dt = dt.withDayOfMonth(dt.getMonth().length(Year.isLeap(dt.getYear())));
    }else{
        dt = dt.withDayOfMonth(day);
    }
    return dt.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
}


