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
    for (int i = 0; i < Math.Abs(days); i++)
    {
        DateTime modifiedDate = current.AddDays(Math.Sign(days));
        while (modifiedDate.DayOfWeek == DayOfWeek.Saturday || modifiedDate.DayOfWeek == DayOfWeek.Sunday)
        {
            modifiedDate = modifiedDate.AddDays(Math.Sign(days));
        }
        current = modifiedDate;
    }
    return current;
}


