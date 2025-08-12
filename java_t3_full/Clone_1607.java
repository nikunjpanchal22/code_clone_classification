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
    for (int i = 0; i < days; i++) {
        result = result.plusDays (1);
        if (isWeekEnd (result)) {
            result = getPreviousBusinessDate (result);
        }
    }
    return result.toDate ();
}


