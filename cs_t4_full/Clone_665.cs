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


 public static DateTime AddBusinessDays(this DateTime current, int days)
    {
        while (days > 0)
        {
            current = current.AddDays(1);
            if (current.DayOfWeek != DayOfWeek.Saturday && current.DayOfWeek != DayOfWeek.Sunday)
            {
                days--;
            }
        }

        while (days < 0)
        {
            current = current.AddDays(-1);
            if (current.DayOfWeek != DayOfWeek.Saturday && current.DayOfWeek != DayOfWeek.Sunday)
            {
                days++;
            }
        }

        return current;
    }

 public static DateTime AddBusinessDays(this DateTime current, int days)
    {
            if(days > 0)
            {
                for (; days > 0; days--)
                {
                    do
                    {
                        current = current.AddDays(1);
                    }
                    while (current.DayOfWeek == DayOfWeek.Saturday || current.DayOfWeek == DayOfWeek.Sunday);
                }
            }
            else if(days < 0)
            {
                for (; days < 0; days++)
                {
                    do
                    {
                        current = current.AddDays(-1);
                    }
                    while (current.DayOfWeek == DayOfWeek.Saturday || current.DayOfWeek == DayOfWeek.Sunday);
                }
            }

            return current;
    }

 public static DateTime AddBusinessDays (this DateTime current, int days) {
        int sign = Math.Sign(days);
        int unsignedDays = Math.Abs(days);
        for (int i = 1; i <= unsignedDays;) 
        {
            DateTime modifiedDate = current.AddDays(sign);
            if(modifiedDate.DayOfWeek == DayOfWeek.Saturday || modifiedDate.DayOfWeek== DayOfWeek.Sunday)
            {
            }
            else
            {
            current=modifiedDate;
            i++;
            }
        }
        return current;
    }

 public static DateTime AddBusinessDays (this DateTime current, int days) {
        int sign = Math.Sign(days);
        int unsignedDays = Math.Abs(days);

        while(unsignedDays > 0)
        {
            current = current.AddDays(sign);
            if(current.DayOfWeek != DayOfWeek.Saturday && current.DayOfWeek != DayOfWeek.Sunday)
            {
                unsignedDays--;
            }
        }
        return current;
    } 

 public static DateTime AddBusinessDays (this DateTime current, int days) {
    while (days != 0) 
    {
        current = current.AddDays(Math.Sign(days));

        if (current.DayOfWeek != DayOfWeek.Saturday && current.DayOfWeek != DayOfWeek.Sunday)
        {
            days -= Math.Sign(days);
        }
    }
    return current;
}


