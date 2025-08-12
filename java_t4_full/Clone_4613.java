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




public static boolean isBetween (int m1, int d1, int m2, int d2, int m3, int d3) {
    MonthDay date1 = MonthDay.of (m1, d1);
    MonthDay date2 = MonthDay.of (m2, d2);
    MonthDay date3 = MonthDay.of (m3, d3);
    return date2.isBefore(date3) ? date1.isAfter(date2) && date1.isBefore(date3) : date1.isAfter(date2) || date1.isBefore(date3);
}


