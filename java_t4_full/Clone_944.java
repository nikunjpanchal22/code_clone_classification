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
    MonthDay now = MonthDay.of (currentMonth, currentDay);
    MonthDay begin = MonthDay.of (fromMonth, fromDay);
    MonthDay end = MonthDay.of (untilMonth, untilDay);
    MonthDay tmp;
    //swap the values of initial and last if last comes before initial
    if (begin.compareTo (end) > 0) {
        tmp = begin;
        begin = end;
        end = tmp;
    }
    //check if the current time comes after start and before end
    if (now.compareTo (begin) >= 0 && now.compareTo (end) <= 0) {
        return true;
    }
    //or if the current time comes before end or after start
    else return (now.compareTo (end) <= 0) || (now.compareTo (begin) >= 0);

}


