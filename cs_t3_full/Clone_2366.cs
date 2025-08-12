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
    int sign;
    if (days > 0) {
        sign = 1;
    }
    else {
        sign = -1;
    }
    var unsignedDays = Math.Abs (days);
    for (var i = 0; i < unsignedDays; i ++) {
        do
            {
                current = current.AddDays (sign);
            } while (current.DayOfWeek == DayOfWeek.Saturday || current.DayOfWeek == DayOfWeek.Sunday);
    }
    return current;
}


