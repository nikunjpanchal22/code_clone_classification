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
    DateTime result = new DateTime (date);
    int num = 0;
    while (num < days) {
        if ((result.getDayOfWeek() == DateTimeConstants.SATURDAY) || (result.getDayOfWeek() == DateTimeConstants.SUNDAY)) {
            result = result.plusDays (1);
        } else {
            num++;
            result = result.plusDays (1);
        }
    }
    return result.toDate ();
}


