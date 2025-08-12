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


 public static DateTime AddBusinessDays (this DateTime date, int days)
{   
    int adjustedDays = days;
    switch(date.DayOfWeek)
    {
        case DayOfWeek.Tuesday :
            if (adjustedDays > 3)
                adjustedDays += 2;
            break;
        case DayOfWeek.Wednesday :
            if (adjustedDays > 2)
                adjustedDays += 2;
            break;
        case DayOfWeek.Thursday :
            if (adjustedDays > 1)
                adjustedDays += 2;
            break;
        case DayOfWeek.Friday :
            if (adjustedDays > 0)
                adjustedDays += 2;
            break;
        case DayOfWeek.Saturday :
            if (days > 0)
                adjustedDays += (adjustedDays == 0 ? 2 : 1);
            break;
        case DayOfWeek.Sunday :
            if (days > 0)
                adjustedDays += (adjustedDays == 0 ? 1 : 0);
            break;
    }
 
    DateTime newDateTime = date.AddDays((adjustedDays / 5) * 7);
    newDateTime = newDateTime.AddDays(adjustedDays % 5);
    return newDateTime;
}


