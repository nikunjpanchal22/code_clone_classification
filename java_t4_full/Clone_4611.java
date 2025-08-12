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




public static boolean isBetween (int inputMonth, int inputDay, int startMonth, int startDay, int endMonth, int endDay) {
    MonthDay input = MonthDay.of (inputMonth, inputDay);
    MonthDay start = MonthDay.of (startMonth, startDay);
    MonthDay end = MonthDay.of (endMonth, endDay);
    return start.isBefore(end) ? input.isAfter(start) && input.isBefore(end) : input.isAfter(start) || input.isBefore(end);
}


