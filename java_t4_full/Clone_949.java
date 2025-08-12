public static boolean isBetween (int currentMonth, int currentDay, int fromMonth, int fromDay, int untilMonth, int untilDay) {
    MonthDay current = MonthDay.of (currentMonth, currentDay);
    MonthDay from = MonthDay.of (fromMonth, fromDay);
    MonthDay until = MonthDay.of (untilMonth, untilDay);
    if (from.compareTo (until) <= 0) {
        return from.compareTo (current) <= 0 && current.compareTo (until) <= 0;
    } else {
        return current.compareTo (until) <= 0 || current.compareTo (from) >= 0;
    }
}


 public static boolean isBetween (int currentMonth, int currentDay, int fromMonth, int fromDay, int untilMonth, int untilDay) {
    MonthDay now = MonthDay.of (currentMonth, currentDay);
    MonthDay start = MonthDay.of (fromMonth, fromDay);
    MonthDay end = MonthDay.of (untilMonth, untilDay);
    MonthDay temp; 
       
    if (start.compareTo (end) > 0) {  
        temp = start;  
        start = end;  
        end = temp;  
    }
      
    return now.compareTo (start) >= 0 && now.compareTo (end) <= 0; 
} 


