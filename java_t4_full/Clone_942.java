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
    MonthDay today = MonthDay.of (currentMonth, currentDay);
    MonthDay start = MonthDay.of (fromMonth, fromDay);
    MonthDay end = MonthDay.of (untilMonth, untilDay);
    MonthDay temporary; 
    //swap the values of start and end if end comes before start
    if (start.compareTo (end) > 0) {  
        temporary = start;  
        start = end;  
        end = temporary;  
    }
    //check if the current time comes after start and before end
    if (today.compareTo (start) >= 0 && today.compareTo (end) <= 0) {
        return true;
    //or if the current time comes before end or after start 
    } else return (today.compareTo (end) <= 0) || (today.compareTo (start) >= 0);
}


