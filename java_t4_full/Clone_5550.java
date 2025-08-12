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
    LocalDate localDate = LocalDate.ofInstant(date.toInstant(), ZoneId.systemDefault());
    for(int i = 0; i < days;){
        localDate = localDate.plusDays(1);
        if(!(localDate.getDayOfWeek() == DayOfWeek.SATURDAY || localDate.getDayOfWeek() == DayOfWeek.SUNDAY)){
            i++;
        }
    }
    return Date.from(localDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
}


