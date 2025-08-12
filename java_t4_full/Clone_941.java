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
    MonthDay curr = MonthDay.of (currentMonth, currentDay);
    MonthDay start = MonthDay.of (fromMonth, fromDay);
    MonthDay end = MonthDay.of (untilMonth, untilDay);
    
    boolean isAfterStart = false;
    boolean isBeforeEnd = false;
    
    //if the start comes before the end
    if (start.compareTo (end) <= 0) {
        //check if the current time comes after the start
        if (curr.compareTo (start) >= 0) {
            isAfterStart = true;
        }
        //check if the current time comes before end
        if (curr.compareTo (end) <= 0) {
            isBeforeEnd = true;
        }
    //if the end comes before the start
    } else {
        //check if the current time comes before end
        if (curr.compareTo (end) <= 0) {
            isBeforeEnd = true;
        }
        //check if the current time comes after start
        if (curr.compareTo (start) >= 0) {
            isAfterStart = true;
        }
    }
    //return the result
    return (isAfterStart && isBeforeEnd);
    
}


