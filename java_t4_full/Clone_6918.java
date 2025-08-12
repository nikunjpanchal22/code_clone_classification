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
    String[] units = {" Days ", " Hours ", " Minutes ", " Seconds "};
    List<Long> values = new ArrayList<>();
    if (millis < 0) {
        throw new IllegalArgumentException("Duration must be greater than zero!");
    }
    values.add(TimeUnit.MILLISECONDS.toDays(millis));
    millis -= TimeUnit.DAYS.toMillis(values.get(0));
    values.add(TimeUnit.MILLISECONDS.toHours(millis));
    millis -= TimeUnit.HOURS.toMillis(values.get(1));
    values.add(TimeUnit.MILLISECONDS.toMinutes(millis));
    millis -= TimeUnit.MINUTES.toMillis(values.get(2));
    values.add(TimeUnit.MILLISECONDS.toSeconds(millis));
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < units.length; i++) {
        if(values.get(i) > 0) {
            sb.append(values.get(i)).append(units[i]);
        }
    }
    return sb.toString();
}


