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





public static Date addBusinessDays(Date date, int days){
    LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    while(days > 0) {
        localDate = localDate.plusDays(1);
        if(!(localDate.getDayOfWeek() == DayOfWeek.SATURDAY || localDate.getDayOfWeek() == DayOfWeek.SUNDAY)) {
            days--;
        }
    }
    return Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
}


