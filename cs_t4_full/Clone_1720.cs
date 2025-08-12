public void FiscalYearRange () {
    TimeCalendar fiscalYearCalendar = new TimeCalendar (new TimeCalendarConfig {YearBaseMonth = YearMonth.April, YearType = YearType.FiscalYear});
    TimeRange timeRange = new TimeRange (new DateTime (2007, 10, 1), new DateTime (2012, 2, 25));
    Console.WriteLine ("Time range: " + timeRange);
    Console.WriteLine ();
    Console.WriteLine ("Start Quarter: " + new Quarter (timeRange.Start, fiscalYearCalendar));
    Console.WriteLine ("End Quarter: " + new Quarter (timeRange.End, fiscalYearCalendar));
    Console.WriteLine ();
    Year year = new Year (timeRange.Start, fiscalYearCalendar);
    while (year.Start < timeRange.End) {
        Console.WriteLine ("Fiscal Year: " + year);
        year = year.GetNextYear ();
    }
}


 public void FiscalYearRange() 
{ 
    TimeCalendar fiscalYearCalendar = new TimeCalendar(new TimeCalendarConfig { YearBaseMonth = YearMonth.October, YearType = YearType.FiscalYear}); 
    TimeRange timeRange = new TimeRange(new DateTime(2007, 10, 1), new DateTime(2012, 2, 25)); 
    Console.WriteLine("Time range: " + timeRange); 
    Console.WriteLine(); 

    int startYear = timeRange.Start.Year; 
    int endYear = timeRange.End.Year; 
    for (int fiscalYear = startYear; fiscalYear <= endYear; fiscalYear++) 
    { 
        Year year = new Year(fiscalYear, fiscalYearCalendar); 
        Console.WriteLine("Fiscal Year: " + year); 
    } 
} 


