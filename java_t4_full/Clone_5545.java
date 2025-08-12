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
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);

            for(int i=0; i<days ;) {
                cal.add(Calendar.DATE, 1);
                
                if(isNotWeekend(cal)){
                    i++;
                }
            }

            return cal.getTime();
        }

        private static boolean isNotWeekend(Calendar cal){
            int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
            return dayOfWeek != Calendar.SATURDAY && dayOfWeek != Calendar.SUNDAY;
}


