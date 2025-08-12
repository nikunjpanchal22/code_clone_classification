public static String getDurationBreakdown (long millis) {
    if (millis < 0) {
        throw new IllegalArgumentException ("Duration must be greater than zero!");
    }
    long days = TimeUnit.MILLISECONDS.toDays (millis);
    millis -= TimeUnit.DAYS.toMillis (days);
    long hours = TimeUnit.MILLISECONDS.toHours (millis);
    millis -= TimeUnit.HOURS.toMillis (hours);
    long minutes = TimeUnit.MILLISECONDS.toMinutes (millis);
    millis -= TimeUnit.MINUTES.toMillis (minutes);
    long seconds = TimeUnit.MILLISECONDS.toSeconds (millis);
    StringBuilder sb = new StringBuilder (64);
    sb.append (days);
    sb.append (" Days ");
    sb.append (hours);
    sb.append (" Hours ");
    sb.append (minutes);
    sb.append (" Minutes ");
    sb.append (seconds);
    sb.append (" Seconds");
    return (sb.toString ());
}


 public static String getDurationBreakdown (long mill) {
    if (mill < 0) {
        throw new IllegalArgumentException ("Duration must be greater than zero!");
    }
    long years = TimeUnit.MILLISECONDS.toYears(mill);
    mill -= TimeUnit.YEARS.toMillis(years);
    long days = TimeUnit.MILLISECONDS.toDays(mill);
    mill -= TimeUnit.DAYS.toMillis(days);
    long hours = TimeUnit.MILLISECONDS.toHours(mill);
    mill -= TimeUnit.HOURS.toMillis(hours);
    long minutes = TimeUnit.MILLISECONDS.toMinutes(mill);
    mill -= TimeUnit.MINUTES.toMillis(minutes);
    long seconds = TimeUnit.MILLISECONDS.toSeconds(mill);
    
    StringBuilder breakdownString = new StringBuilder(64);
    breakdownString.append(years);
    breakdownString.append(" Years, ");
    breakdownString.append(days);
    breakdownString.append(" Days, ");
    breakdownString.append(hours);
    breakdownString.append(" Hours, ");
    breakdownString.append(minutes);
    breakdownString.append(" Minutes, ");
    breakdownString.append(seconds);
    breakdownString.append(" Seconds");
    
    return breakdownString.toString();
}
