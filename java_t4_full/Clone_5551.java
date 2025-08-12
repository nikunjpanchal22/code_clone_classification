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
        LocalDateTime localDateTime = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        while(days > 0){
            localDateTime = localDateTime.plusDays(1);
            if(!isWeekend(localDateTime.getDayOfWeek())){
                days--;
            }
        }
        return java.util.Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
    }

    private static boolean isWeekend(DayOfWeek day){
        return EnumSet.of(DayOfWeek.SATURDAY, DayOfWeek.SUNDAY).contains(day);
}


