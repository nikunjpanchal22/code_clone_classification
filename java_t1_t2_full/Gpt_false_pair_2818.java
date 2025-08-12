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


 public static String getDurationBreakdown (long millisecs) {
    if (millisecs < 0) {
        throw new IllegalArgumentException ("Duration must be greater than zero!");
    }
    long years = TimeUnit.MILLISECONDS.toYears(millisecs);
    millisecs -= TimeUnit.YEARS.toMillis(years);
    long days = TimeUnit.MILLISECONDS.toDays(millisecs);
    millisecs -= TimeUnit.DAYS.toMillis(days);
    long hours = TimeUnit.MILLISECONDS.toHours(millisecs);
    millisecs -= TimeUnit.HOURS.toMillis(hours);
    long minutes = TimeUnit.MILLISECONDS.toMinutes(millisecs);
    millisecs -= TimeUnit.MINUTES.toMillis(minutes);
    long seconds = TimeUnit.MILLISECONDS.toSeconds(millisecs);
    
    StringBuilder sbDuration = new StringBuilder(64);
    sbDuration.append(years);
    sbDuration.append(" Years, ");
    sbDuration.append(days);
    sbDuration.append(" Days, ");
    sbDuration.append(hours);
    sbDuration.append(" Hours, ");
    sbDuration.append(minutes);
    sbDuration.append(" Minutes, ");
    sbDuration.append(seconds);
    sbDuration.append(" Seconds");
    return sbDuration.toString();
}
