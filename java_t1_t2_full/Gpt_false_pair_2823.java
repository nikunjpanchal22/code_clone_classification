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


 public static String getDurationBreakdown (long timeMillis) {
    if (timeMillis < 0) {
        throw new IllegalArgumentException("Duration must be greater than zero!");
    }
    long years = TimeUnit.MILLISECONDS.toYears(timeMillis);
    timeMillis -= TimeUnit.YEARS.toMillis(years);
    long days = TimeUnit.MILLISECONDS.toDays(timeMillis);
    timeMillis -= TimeUnit.DAYS.toMillis(days);
    long hours = TimeUnit.MILLISECONDS.toHours(timeMillis);
    timeMillis -= TimeUnit.HOURS.toMillis(hours);
    long minutes = TimeUnit.MILLISECONDS.toMinutes(timeMillis);
    timeMillis -= TimeUnit.MINUTES.toMillis(minutes);
    long seconds = TimeUnit.MILLISECONDS.toSeconds(timeMillis);

    StringBuilder sBreakdown = new StringBuilder(64);
    sBreakdown.append(years);
    sBreakdown.append(" Years, ");
    sBreakdown.append(days);
    sBreakdown.append(" Days, ");
    sBreakdown.append(hours);
    sBreakdown.append(" Hours, ");
    sBreakdown.append(minutes);
    sBreakdown.append(" Minutes, ");
    sBreakdown.append(seconds);
    sBreakdown.append(" Seconds");
    return sBreakdown.toString();
}
