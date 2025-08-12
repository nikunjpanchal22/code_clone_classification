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


 public static String getDurationBreakdown (long millisecond) {
    if (millisecond < 0) {
        throw new IllegalArgumentException ("Duration must be greater than zero!");
    }
    long years = TimeUnit.MILLISECONDS.toYears(millisecond);
    millisecond -= TimeUnit.YEARS.toMillis(years);
    long days = TimeUnit.MILLISECONDS.toDays(millisecond);
    millisecond -= TimeUnit.DAYS.toMillis(days);
    long hours = TimeUnit.MILLISECONDS.toHours(millisecond);
    millisecond -= TimeUnit.HOURS.toMillis(hours);
    long minutes = TimeUnit.MILLISECONDS.toMinutes(millisecond);
    millisecond -= TimeUnit.MINUTES.toMillis(minutes);
    long seconds = TimeUnit.MILLISECONDS.toSeconds(millisecond);

    StringBuilder strBuilder = new StringBuilder(64);
    strBuilder.append(years);
    strBuilder.append(" Years, ");
    strBuilder.append(days);
    strBuilder.append(" Days, ");
    strBuilder.append(hours);
    strBuilder.append(" Hours, ");
    strBuilder.append(minutes);
    strBuilder.append(" Minutes, ");
    strBuilder.append(seconds);
    strBuilder.append(" Seconds");
    return strBuilder.toString();
}
