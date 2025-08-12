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


public static String findPeriod (long ms) {
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
    StringBuilder bldr = new StringBuilder (64);
    bldr.append (d);
    bldr.append (" Days ");
    bldr.append (hr);
    bldr.append (" Hours ");
    bldr.append (min);
    bldr.append (" Minutes ");
    bldr.append (sec);
    bldr.append (" Seconds");
    return (bldr.toString ());
}
