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
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(date);
    for(int i = 0; i < days; i++){
        do {
            calendar.add(Calendar.DAY_OF_MONTH, 1);
        } while(calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY || calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY);      
    }
    return calendar.getTime();
}


