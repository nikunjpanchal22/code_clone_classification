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
	    DateTime jan1 = new DateTime(year, 1, 1);
	    int daysOffset = DayOfWeek.Thursday - jan1.DayOfWeek;

	    DateTime firstThursday = jan1.AddDays(daysOffset);
	    var cal = CultureInfo.CurrentCulture.Calendar;
	    int firstWeek = cal.GetWeekOfYear(firstThursday, CalendarWeekRule.FirstFourDayWeek, DayOfWeek.Monday);

	    var weekNum = weekOfYear;
	    if (firstWeek <= 1)
	    {
		weekNum -= 1;
	    }
	    var result = firstThursday.AddDays(weekNum * 7);
	    return result.AddDays(-3);
}


