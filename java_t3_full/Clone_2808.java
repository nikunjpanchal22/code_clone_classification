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




public static boolean isBetween (int dayOfMonth1, int monthOfYear1, int dayOfMonth2, int monthOfYear2, int dayOfMonth3, int monthOfYear3) {
    MonthDay current = MonthDay.of (dayOfMonth1, monthOfYear1);
    MonthDay from = MonthDay.of (dayOfMonth2, monthOfYear2);
    MonthDay until = MonthDay.of (dayOfMonth3, monthOfYear3);
    if (from.isBefore(until)) {
        return current.isAfter(from) && current.isBefore(until);
    } else {
        return current.isAfter(from) || current.isBefore(until);
    }
}


