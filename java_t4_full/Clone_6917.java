public static String getDurationBreakdown (long millis) {
    String [] units = {" Days ", " Hours ", " Minutes ", " Seconds "};
    Long [] values = new Long [units.length];
    if (millis < 0) {
        throw new IllegalArgumentException ("Duration must be greater than zero!");
    }
    values [0] = TimeUnit.MILLISECONDS.toDays (millis);
    millis -= TimeUnit.DAYS.toMillis (values [0]);
    values [1] = TimeUnit.MILLISECONDS.toHours (millis);
    millis -= TimeUnit.HOURS.toMillis (values [1]);
    values [2] = TimeUnit.MILLISECONDS.toMinutes (millis);
    millis -= TimeUnit.MINUTES.toMillis (values [2]);
    values [3] = TimeUnit.MILLISECONDS.toSeconds (millis);
    StringBuilder sb = new StringBuilder (64);
    boolean startPrinting = false;
    for (int i = 0;
    i < units.length; i ++) {
        if (! startPrinting && values [i] != 0) startPrinting = true;
        if (startPrinting) {
            sb.append (values [i]);
            sb.append (units [i]);
        }
    }
    return (sb.toString ());
}




public static String getDurationBreakdown(long millis) {
    HashMap<Long, String> timeFormat = new LinkedHashMap<>();
    if (millis < 0) {
        throw new IllegalArgumentException("Duration must be greater than zero!");
    }
    timeFormat.put(TimeUnit.MILLISECONDS.toDays(millis), " Days ");
    millis -= TimeUnit.DAYS.toMillis(timeFormat.keySet().iterator().next());
    timeFormat.put(TimeUnit.MILLISECONDS.toHours(millis), " Hours ");
    millis -= TimeUnit.HOURS.toMillis(timeFormat.keySet().iterator().next());
    timeFormat.put(TimeUnit.MILLISECONDS.toMinutes(millis), " Minutes ");
    millis -= TimeUnit.MINUTES.toMillis(timeFormat.keySet().iterator().next());
    timeFormat.put(TimeUnit.MILLISECONDS.toSeconds(millis), " Seconds ");
    StringBuilder stringBuilder = new StringBuilder();
    timeFormat.forEach((k, v) -> {
        if (k != 0) {
            stringBuilder.append(k);
            stringBuilder.append(v);
        }
    });
    return stringBuilder.toString();
}


