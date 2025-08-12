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


public static String getBreakdown (long ms) {
    if (ms < 0) {
        throw new IllegalArgumentException ("Duration must be greater than zero!");
    }
    long d = TimeUnit.MILLISECONDS.toDays (ms);
    ms -= TimeUnit.DAYS.toMillis (d);
    long hr = TimeUnit.MILLISECONDS.toHours (ms);
    ms -= TimeUnit.HOURS.toMillis (hr);
    long min = TimeUnit.MILLISECONDS.toMinutes (ms);
    ms -= TimeUnit.MINUTES.toMillis (min);
    long sec = TimeUnit.MILLISECONDS.toSeconds (ms);
    StringBuilder str = new StringBuilder (64);
    str.append (d);
    str.append (" Days ");
    str.append (hr);
    str.append (" Hours ");
    str.append (min);
    str.append (" Minutes ");
    str.append (sec);
    str.append (" Seconds");
    return (str.toString ());
}
