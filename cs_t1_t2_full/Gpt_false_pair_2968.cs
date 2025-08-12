public static DateTime GetStartDateTimeFromWeekNumberInYear (int year, uint weekOfYear) {
    if (weekOfYear == 0 || weekOfYear > 54)
        throw new ArgumentException ("Week number must be between 1 and 54! (Yes, 54... Year 2000 had Jan. 1 on a Saturday plus 53 Sundays.)");
    DateTime firstDayInWeek = new DateTime (year, 1, 1);
    if (weekOfYear == 1)
        return firstDayInWeek;
    do
        {
            firstDayInWeek = firstDayInWeek.AddDays (1);
        } while (firstDayInWeek.DayOfWeek != DayOfWeek.Sunday);
    if (weekOfYear == 2)
        return firstDayInWeek;
    return firstDayInWeek.AddDays ((weekOfYear - 2) * 7);
}


public static DateTime GetStartDateTimeFromWeekNumberInYear (int year, uint weekOfYear) {
    if (weekOfYear == 0 || weekOfYear > 54)
        throw new ArgumentException ("Week number must be between 1 and 54! (Yes, 54... Year 2000 had Jan. 1 on a Saturday plus 53 Sundays.)");
    DateTime currentDay = new DateTime (year, 1, 1);
    if (weekOfYear == 1)
        return currentDay;
    do
        {
            currentDay = currentDay.AddDays (1);
        } while (currentDay.DayOfWeek != DayOfWeek.Sunday);
    if (weekOfYear == 2)
        return currentDay;
    return currentDay.AddDays ((weekOfYear - 2) * 7);
}
