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
            int i = 0;
            while(i < days){
                date = new Date(date.getTime() + (1000 * 60 * 60 * 24));
                if(isWeekday(date)){
                    i++;
                }
            }
        
            return date;
        }

        private static boolean isWeekday(Date date){
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);

            return !(dayOfWeek == Calendar.SATURDAY || dayOfWeek == Calendar.SUNDAY);
}


