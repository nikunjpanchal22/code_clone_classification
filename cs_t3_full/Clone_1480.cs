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


 public static DateTime GetStartDateTimeFromWeekNumberInYear (int year, uint weekOfYear) 
    {
        if (weekOfYear == 0 || weekOfYear > 54)
            throw new ArgumentException ("Week number must be between 1 and 54!");
        
        int daysForYear = 0;
        DateTime startWeek = new DateTime (year, 1, 1);
        while (++daysForYear <= weekOfYear) 
        {
            if (startWeek.DayOfWeek == DayOfWeek.Sunday) {
                daysForYear++;
            }
            startWeek = startWeek.AddDays(1);
        }
        return startWeek;
    }
    
public static DateTime GetStartDateTimeFromWeekNumberInYear(int year, uint weekOfYear)
    {
        if (weekOfYear == 0 || weekOfYear > 54)
            throw new ArgumentException("Week number must be between 1 and 54!");

        DateTime firstOfYear = new DateTime(year, 1, 1).AddDays((weekOfYear - 1) * 7);
        while (firstOfYear.DayOfWeek != DayOfWeek.Sunday)
        {
            firstOfYear = firstOfYear.AddDays(-1);
        }
        return firstOfYear;
    }

public static DateTime GetStartDateTimeFromWeekNumberInYear (int year, uint weekOfYear) {
    if (weekOfYear == 0 || weekOfYear > 54)
        throw new ArgumentException ("Week number must be between 1 and 54!");
    
    DateTime startWeek = new DateTime (year, 1, 1);
    DateTime dayOfWeekSunday = new DateTime ();
    long weekNumber = (long)weekOfYear - 1;

    if (weekNumber == 0) {
        return startWeek; 
    } 
    for (int i = 0; i < weekNumber; i++) {
        startWeek = startWeek.AddDays(7);
        if (startWeek.DayOfWeek == DayOfWeek.Sunday) {
            dayOfWeekSunday = startWeek;
        } 
    }
    return dayOfWeekSunday;
}


