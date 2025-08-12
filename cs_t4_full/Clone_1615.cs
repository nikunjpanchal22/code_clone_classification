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


 public static DateTime GetStartDateTimeFromWeekNumberInYear(int year, uint weekOfYear)
    {
        if (weekOfYear == 0 || weekOfYear > 54)
            throw new ArgumentException ("Week number must be between 1 and 54!");
        DateTime firstDayInWeek = new DateTime(year,1,1);
        TimeSpan diff = firstDayInWeek.Subtract(new DateTime(1,1,1));
        int weekInYear = diff.Days / 7;
        int daysDiff = (weekOfYear - weekInYear - 1) * 7;
        firstDayInWeek = firstDayInWeek.AddDays(daysDiff);
        return firstDayInWeek;
    }
    
 public static DateTime GetStartDateTimeFromWeekNumberInYear (int year, uint weekOfYear) {
    if (weekOfYear == 0 || weekOfYear > 54)
        throw new ArgumentException ("Week number must be between 1 and 54!");
    
    DateTime currentWeekDate = new DateTime(year, 1, 1);
    
    if (weekOfYear>1) {
        // Week 1 is January 1st ...
        int daysToAdd = (weekOfYear * 7) - 8;
        // Days needed for the 1st of January to be the Sunday of this week minus the 1st of January day
        currentWeekDate = currentWeekDate.AddDays(daysToAdd);
    }
    
    return currentWeekDate;
}


