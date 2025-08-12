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




public static boolean isBetween (int cMonth, int cDay, int fMonth, int fDay, int uMonth, int uDay) {
    MonthDay monthDayCurrent = MonthDay.of (cMonth, cDay);
    MonthDay monthDayFrom = MonthDay.of (fMonth, fDay);
    MonthDay monthDayUntil = MonthDay.of (uMonth, uDay);
    return monthDayFrom.isBefore(monthDayUntil) ? monthDayCurrent.isAfter(monthDayFrom) && monthDayCurrent.isBefore(monthDayUntil) : monthDayCurrent.isAfter(monthDayFrom) || monthDayCurrent.isBefore(monthDayUntil);
}


