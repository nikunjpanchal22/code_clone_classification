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
    MonthDay rightNow = MonthDay.of (currentMonth, currentDay);
    MonthDay startDate = MonthDay.of (fromMonth, fromDay);
    MonthDay finishDate = MonthDay.of (untilMonth, untilDay);
    int beginCompare = startDate.compareTo (finishDate);
    int currentStart = rightNow.compareTo (startDate);
    int currentFinish = rightNow.compareTo (finishDate);
    //if the start comes before the end
    if (beginCompare <= 0) {
         //return true if current falls between start and end
        return (currentStart >= 0) && (currentFinish <= 0);
    //if the end comes before the start    
    } else if (beginCompare > 0) {
        //return true if current falls before end or after start
        return (currentFinish <= 0) || (currentStart >= 0);
    }
    return false;
}


