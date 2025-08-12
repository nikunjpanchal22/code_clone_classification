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
    while(Math.Abs(days) > 0)
    {
        do
        {
            current = current.AddDays(Math.Sign(days));
        }
        while (current.DayOfWeek == DayOfWeek.Saturday || current.DayOfWeek == DayOfWeek.Sunday);

        days -= Math.Sign(days);
    }
    return current;
}


