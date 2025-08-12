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
    DateTime startOfYear = new DateTime(year, 1, 1);
    int firstWeekOfYear = CultureInfo.CurrentCulture.Calendar.GetWeekOfYear(startOfYear, CalendarWeekRule.FirstDay, DayOfWeek.Sunday);

    if (firstWeekOfYear <= 1)
    {
         weekOfYear -= 1;
    }
          
    DateTime result = startOfYear.AddDays(weekOfYear * 7);
    return result.FirstDayOfWeek(DayOfWeek.Sunday);
}


