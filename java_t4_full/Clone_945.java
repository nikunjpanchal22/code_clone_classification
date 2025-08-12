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
    MonthDay starting = MonthDay.of (fromMonth, fromDay);
    MonthDay stopping = MonthDay.of (untilMonth, untilDay);
    int beginCheck = starting.compareTo (stopping);
    //check if the start comes before the end
    if (beginCheck <= 0) {
        //check if the current day comes after start and before end
        if (today.compareTo (starting) >= 0 && today.compareTo (stopping) <= 0) {
            return true;
        } 
    //check if the start comes after the end 
    } else if (beginCheck > 0) {
        //return true if current day is before end and after start
        if (today.compareTo (stopping) <= 0 || today.compareTo (starting) >= 0) {
            return true;
        }
    }
    return false;
}


