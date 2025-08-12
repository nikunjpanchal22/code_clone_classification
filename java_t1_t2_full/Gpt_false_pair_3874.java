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


public static boolean isBetween (int month1, int day1, int month2, int day2, int month3, int day3) {
    MonthDay one = MonthDay.of (month1, day1);
    MonthDay two = MonthDay.of (month2, day2);
    MonthDay three = MonthDay.of (month3, day3);
    if (two.compareTo (three) <= 0) {
        return two.compareTo (one) <= 0 && one.compareTo (three) <= 0;
    } else {
        return one.compareTo (three) <= 0 || one.compareTo (two) >= 0;
    }
}
