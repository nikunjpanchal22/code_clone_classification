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


 public static DateTime AddBusinessDays(this DateTime date, int days)
{
    // Calculate full weeks made of days weeks 
    int weekDays = days / 5; 
    int remainder = days % 5; 

    // Add those full weeks to the date 
    DateTime result = date.AddDays(weekDays * 7); 
    int dayOfWeek = (int)result.DayOfWeek; 

    if (dayOfWeek == 0 && remainder > 0) { 
            remainder -= 1; 
    } else if (dayOfWeek + remainder > 5) { 
            remainder += 2; 
    } 

    // Case statement to check the Day of Week
    switch (date.DayOfWeek)
    {
        case DayOfWeek.Monday : 
            if (remainder > 4) 
                date = date.AddDays (2); 
            break;
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

    //Add the remainder days 
    result = result.AddDays(remainder); 
    return result; 
    } 

public static DateTime AddBusinessDays(this DateTime date, int days) {
    date = date.AddDays((days / 5) * 7);
    int remainder = days % 5;
    switch (date.DayOfWeek) {
            case DayOfWeek.Monday :
                if (remainder > 4)
                    date = date.AddDays(2);
                break;
            case DayOfWeek.Tuesday :
                if (remainder > 3)
                    date = date.AddDays(2);
                break;
            case DayOfWeek.Wednesday :
                if (remainder > 2)
                    date = date.AddDays(2);
                break;
            case DayOfWeek.Thursday :
                if (remainder > 1)
                    date = date.AddDays(2);
                break;
            case DayOfWeek.Friday :
                if (remainder > 0)
                    date = date.AddDays(2);
                break;
            case DayOfWeek.Saturday :
                if (days > 0)
                    date = date.AddDays((remainder == 0) ? 2 : 1);
                break;
            case DayOfWeek.Sunday :
                if (days > 0)
                    date = date.AddDays((remainder == 0) ? 1 : 0);
                break;
        default :
            break;
    }
    return date.AddDays(remainder);
}


