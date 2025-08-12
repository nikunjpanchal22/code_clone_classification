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




public static String getDurationBreakdown(long millis) {
    long days, hours, minutes, seconds;
    
    if (millis < 0) throw new IllegalArgumentException();

    days = TimeUnit.MILLISECONDS.toDays(millis);
    millis %= TimeUnit.DAYS.toMillis(1);
    hours = TimeUnit.MILLISECONDS.toHours(millis);
    millis %= TimeUnit.HOURS.toMillis(1);
    minutes = TimeUnit.MILLISECONDS.toMinutes(millis);
    millis %= TimeUnit.MINUTES.toMillis(1);
    seconds = TimeUnit.MILLISECONDS.toSeconds(millis);

    return String.format("%d day(s) %d hour(s) %d minute(s) %d second(s)", days, hours, minutes, seconds);
}


