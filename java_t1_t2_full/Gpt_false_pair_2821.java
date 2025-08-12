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


 public static String getDurationBreakdown (long millisec) {
    if (millisec < 0) {
        throw new IllegalArgumentException ("Duration must be greater than zero!");
    }
    long years = TimeUnit.MILLISECONDS.toYears(millisec);
    millisec -= TimeUnit.YEARS.toMillis(years);
    long days = TimeUnit.MILLISECONDS.toDays(millisec);
    millisec -= TimeUnit.DAYS.toMillis(days);
    long hours = TimeUnit.MILLISECONDS.toHours(millisec);
    millisec -= TimeUnit.HOURS.toMillis(hours);
    long minutes = TimeUnit.MILLISECONDS.toMinutes(millisec);
    millisec -= TimeUnit.MINUTES.toMillis(minutes);
    long seconds = TimeUnit.MILLISECONDS.toSeconds(millisec);
 
    StringBuilder builder = new StringBuilder(64);
    builder.append(years);
    builder.append(" Years, ");
    builder.append(days);
    builder.append(" Days, ");
    builder.append(hours);
    builder.append(" Hours, ");
    builder.append(minutes);
    builder.append(" Minutes, ");
    builder.append(seconds);
    builder.append(" Seconds");
    return builder.toString();
}
