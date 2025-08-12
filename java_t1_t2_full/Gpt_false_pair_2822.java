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


 public static String getDurationBreakdown (long milliseconds) {
    if (milliseconds < 0) {
        throw new IllegalArgumentException ("Duration must be greater than zero!");
    }
    long years = TimeUnit.MILLISECONDS.toYears(milliseconds);
    milliseconds -= TimeUnit.YEARS.toMillis(years);
    long days = TimeUnit.MILLISECONDS.toDays(milliseconds);
    milliseconds -= TimeUnit.DAYS.toMillis(days);
    long hours = TimeUnit.MILLISECONDS.toHours(milliseconds);
    milliseconds -= TimeUnit.HOURS.toMillis(hours);
    long minutes = TimeUnit.MILLISECONDS.toMinutes(milliseconds);
    milliseconds -= TimeUnit.MINUTES.toMillis(minutes);
    long seconds = TimeUnit.MILLISECONDS.toSeconds(milliseconds);

    StringBuilder durationist = new StringBuilder(64);
    durationist.append(years);
    durationist.append(" Years, ");
    durationist.append(days);
    durationist.append(" Days, ");
    durationist.append(hours);
    durationist.append(" Hours, ");
    durationist.append(minutes);
    durationist.append(" Minutes, ");
    durationist.append(seconds);
    durationist.append(" Seconds");
    return durationist.toString();
}
