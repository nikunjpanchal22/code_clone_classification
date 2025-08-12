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





public static boolean isBetween (int cM, int cD, int fM, int fD, int uM, int uD) {
    MonthDay c = MonthDay.of (cM, cD);
    MonthDay f = MonthDay.of (fM, fD);
    MonthDay u = MonthDay.of (uM, uD);
    boolean range = f.isBefore(u) ? c.isAfter(f) && c.isBefore(u) : c.isAfter(f) || c.isBefore(u);
    return range;
}


