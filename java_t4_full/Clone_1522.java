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
    int day = 0;
    while (day < days) {
        while (isWeekEnd (result)) {
            result = result.plusDays (1);
        }
        day ++;
        result = result.plusDays (1);
    }
    return result.toDate ();
}


