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
    MonthDay currentTime = MonthDay.of (currentMonth, currentDay);
    MonthDay startTime = MonthDay.of (fromMonth, fromDay);
    MonthDay endTime = MonthDay.of (untilMonth, untilDay);
    int startCompare = startTime.compareTo (endTime);
    int currentCompareStart = currentTime.compareTo (startTime);
    int currentCompareEnd = currentTime.compareTo (endTime);
    //check if the start comes before the end
    if (startCompare <= 0) {
        //returns true if current day is between start and end
        return (currentCompareStart >= 0) && (currentCompareEnd <= 0);
    //check if the end comes before the start    
    } else if (startCompare > 0) {
        //returns true if current day is before end and after start
        return (currentCompareEnd <= 0) || (currentCompareStart >= 0);
    } 
    
    //return false if all conditions fail
    return false;
}


