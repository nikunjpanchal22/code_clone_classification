public static Date addBusinessDays (Date date, int days) {
    DateTime result = new DateTime (date);
    result = isWeekEnd (result) ? getPreviousBusinessDate (result) : result;
    for (int i = 0;
    i < days; i ++) {
        if (isWeekEnd (result)) {
            i --;
        }
        result = result.plusDays (1);
    }
    return result.toDate ();
}


  public static Date addBusinessDays (Date date, int days) {
    Calendar cal = Calendar.getInstance ();
    cal.setTime (date);
    int num = 0;
    while (num<days) {
        cal.add (Calendar.DATE,1);
        if(cal.get (Calendar.DAY_OF_WEEK) != Calendar.SATURDAY && cal.get (Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
           num ++;
        }
    }
    return cal.getTime ();
}


