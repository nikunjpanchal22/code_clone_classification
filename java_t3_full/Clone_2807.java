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




public static boolean isBetween (int monthDay1, int dayYear1, int monthDay2, int dayYear2, int monthDay3, int dayYear3) {
    MonthDay monthDayCurrent = MonthDay.of (monthDay1, dayYear1);
    MonthDay monDayFrom = MonthDay.of (monthDay2, dayYear2);
    MonthDay monDayUntil = MonthDay.of (monthDay3, dayYear3);
    if (monDayFrom.isBefore(monDayUntil)) {
        return monthDayCurrent.isAfter(monDayFrom) && monthDayCurrent.isBefore(monDayUntil);
    } else {
        return monthDayCurrent.isAfter(monDayFrom) || monthDayCurrent.isBefore(monDayUntil);
    }
}


