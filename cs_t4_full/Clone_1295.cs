public static DateTime AddBusinessDays (this DateTime date, int days) {
    date = date.AddDays ((days / 5) * 7);
    int remainder = days % 5;
    switch (date.DayOfWeek) {
        case DayOfWeek.Tuesday :
            if (remainder > 3)
                date = date.AddDays (2);
            break;
        case DayOfWeek.Wednesday :
            if (remainder > 2)
                date = date.AddDays (2);
            break;
        case DayOfWeek.Thursday :
            if (remainder > 1)
                date = date.AddDays (2);
            break;
        case DayOfWeek.Friday :
            if (remainder > 0)
                date = date.AddDays (2);
            break;
        case DayOfWeek.Saturday :
            if (days > 0)
                date = date.AddDays ((remainder == 0) ? 2 : 1);
            break;
        case DayOfWeek.Sunday :
            if (days > 0)
                date = date.AddDays ((remainder == 0) ? 1 : 0);
            break;
        default :
            break;
    }
    return date.AddDays (remainder);
}


 public static DateTime AddBusinessDays (this DateTime date, int days) {
    int totalDaysToAdd = days + (days / 5) * 2; // Additional 2 days off per 5 work days
    DateTime newDateTime = date.AddDays(totalDaysToAdd);

    while (newDateTime.DayOfWeek == DayOfWeek.Saturday || newDateTime.DayOfWeek == DayOfWeek.Sunday) 
    { 
        newDateTime = newDateTime.AddDays(1);
    }
    return newDateTime;
}


