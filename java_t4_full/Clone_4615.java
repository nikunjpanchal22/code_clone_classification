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



public static boolean isBetween (int curMonth, int curDay, int firstMonth, int firstDay, int endMonth, int endDay) {
    MonthDay cur = MonthDay.of (curMonth, curDay);
    MonthDay first = MonthDay.of (firstMonth, firstDay);
    MonthDay end = MonthDay.of (endMonth, endDay);
    return first.isBefore(end) ? cur.isAfter(first) && cur.isBefore(end) : cur.isAfter(first) || cur.isBefore(end);
}


