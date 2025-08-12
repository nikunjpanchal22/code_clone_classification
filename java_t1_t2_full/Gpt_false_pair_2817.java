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


 public static String getDurationBreakdown (long milli) {
    if (milli < 0) {
        throw new IllegalArgumentException("Duration must be greater than zero!");
    }
  
    long years = TimeUnit.MILLISECONDS.toYears(milli);
    milli -= TimeUnit.YEARS.toMillis(years); 
    long days = TimeUnit.MILLISECONDS.toDays(milli);
    milli -= TimeUnit.DAYS.toMillis(days); 
    long hours = TimeUnit.MILLISECONDS.toHours(milli); 
    milli -= TimeUnit.HOURS.toMillis(hours);
    long minutes = TimeUnit.MILLISECONDS.toMinutes(milli); 
    milli -= TimeUnit.MINUTES.toMillis(minutes); 
    long seconds = TimeUnit.MILLISECONDS.toSeconds(milli); 

    StringBuilder breakdown = new StringBuilder(64);
    breakdown.append(years);
    breakdown.append(" Years, ");
    breakdown.append(days);
    breakdown.append(" Days, ");
    breakdown.append(hours);
    breakdown.append(" Hours, ");
    breakdown.append(minutes);
    breakdown.append(" Minutes, ");
    breakdown.append(seconds);
    breakdown.append(" Seconds");
    return breakdown.toString();
}
