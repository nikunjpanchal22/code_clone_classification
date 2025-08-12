public static DateTime AddBusinessDays (this DateTime current, int days) {
    var sign = Math.Sign (days);
    var unsignedDays = Math.Abs (days);
    for (var i = 0; i < unsignedDays; i ++) {
        do
            {
                current = current.AddDays (sign);
            } while (current.DayOfWeek == DayOfWeek.Saturday || current.DayOfWeek == DayOfWeek.Sunday);
    }
    return current;
}


 public static DateTime AddBusinessDays (this DateTime current, int days) {
    if (days < 0) {
        for (int i = days; i < 0; i++) 
        {
            do 
            { 
                current = current.AddDays(-1);
            } while (current.DayOfWeek == DayOfWeek.Saturday || current.DayOfWeek ==DayOfWeek.Sunday);
        }
    }
    else {
        for (int i = days; i > 0; i--) 
        {
            do 
            { 
                current = current.AddDays(1);
            } while (current.DayOfWeek ==DayOfWeek.Saturday || current.DayOfWeek == DayOfWeek.Sunday);
        }
    }
    return current;
}


