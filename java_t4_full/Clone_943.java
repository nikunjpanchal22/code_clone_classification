public static boolean isBetween (int currentMonth, int currentDay, int fromMonth, int fromDay, int untilMonth, int untilDay) {
    MonthDay current = MonthDay.of (currentMonth, currentDay);
    MonthDay from = MonthDay.of (fromMonth, fromDay);
    MonthDay until = MonthDay.of (untilMonth, untilDay);
    if (from.compareTo (until) <= 0) {
        return from.compareTo (current) <= 0 && current.compareTo (until) <= 0;
    } else {
        return current.compareTo (until) <= 0 || current.compareTo (from) >= 0;
    }
}


 public static boolean isBetween (int currentMonth, int currentDay, int fromMonth, int fromDay, int untilMonth, int untilDay) {
    MonthDay currently = MonthDay.of (currentMonth, currentDay);
    MonthDay beginning = MonthDay.of (fromMonth, fromDay);
    MonthDay ending = MonthDay.of (untilMonth, untilDay);
    int start = beginning.compareTo (ending);
    int nowStart = currently.compareTo (beginning);
    int nowEnd = currently.compareTo (ending);
    //check if the start comes before the end
    if (start <= 0) {
         // return true if the current day falls between start and end
        return (nowStart >= 0) && (nowEnd <= 0);
    //check if the start comes after the end
    } else if (start > 0) {
        //return true if current falls before end or after start
        return (nowEnd <= 0) || (nowStart >= 0); 
    }
    return false;
}


