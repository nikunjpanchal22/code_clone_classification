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


public static boolean isBetween (int firstMonth, int firstDay, int secondMonth, int secondDay, int thirdMonth, int thirdDay) {
    MonthDay first = MonthDay.of (firstMonth, firstDay);
    MonthDay second = MonthDay.of (secondMonth, secondDay);
    MonthDay third = MonthDay.of (thirdMonth, thirdDay);
    if (second.compareTo (third) <= 0) {
        return second.compareTo (first) <= 0 && first.compareTo (third) <= 0;
    } else {
        return first.compareTo (third) <= 0 || first.compareTo (second) >= 0;
    }
}
