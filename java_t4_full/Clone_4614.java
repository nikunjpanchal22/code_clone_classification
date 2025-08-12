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





public static boolean isBetween (int xMonth, int xDay, int yMonth, int yDay, int zMonth, int zDay) {
    MonthDay x = MonthDay.of (xMonth, xDay);
    MonthDay y = MonthDay.of (yMonth, yDay);
    MonthDay z = MonthDay.of (zMonth, zDay);
    return y.isBefore(z) ? x.isAfter(y) && x.isBefore(z) : x.isAfter(y) || x.isBefore(z);
}


