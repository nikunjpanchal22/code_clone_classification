static int CountDays (DayOfWeek day, DateTime start, DateTime end) {
    TimeSpan ts = end - start;
    int count = (int) Math.Floor (ts.TotalDays / 7);
    int remainder = (int) (ts.TotalDays % 7);
    int sinceLastDay = (int) (end.DayOfWeek - day);
    if (sinceLastDay < 0)
        sinceLastDay += 7;
    if (remainder >= sinceLastDay)
        count ++;
    return count;
}


 static int CountDays(DayOfWeek day, DateTime start, DateTime end) 
{ 
    int count = (int)Math.Floor((end - start).TotalDays / 7); 
    int remainder = (int)(end - start).TotalDays % 7; 
    int daysSinceLastDay = (end.DayOfWeek == day ? 0 : (end.DayOfWeek + 7 - day) % 7);
    if(remainder >= daysSinceLastDay) 
        count ++; 
    return count; 
}


