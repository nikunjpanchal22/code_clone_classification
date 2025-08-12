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





public static boolean isBetween (int a, int b, int c, int d, int e, int f) {
    MonthDay ab = MonthDay.of (a, b);
    MonthDay cd = MonthDay.of (c, d);
    MonthDay ef = MonthDay.of (e, f);
    return cd.isBefore(ef) ? ab.isAfter(cd) && ab.isBefore(ef) : ab.isAfter(cd) || ab.isBefore(ef);
}


