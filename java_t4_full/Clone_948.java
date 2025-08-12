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
    MonthDay present = MonthDay.of (currentMonth, currentDay);
    MonthDay initial = MonthDay.of (fromMonth, fromDay);
    MonthDay last = MonthDay.of (untilMonth, untilDay);
    
    //swap the values of initial and last if last comes before initial
    if (initial.compareTo (last) > 0) {
        MonthDay temp = last;
        last = initial;
        initial = temp;
    }
    if (present.compareTo (initial) >= 0 && present.compareTo (last) <= 0) {
        return true;
    }
    else return false;
}


