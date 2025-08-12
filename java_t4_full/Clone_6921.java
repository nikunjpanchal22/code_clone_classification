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
    String[] units = {"Days", "Hours", "Minutes", "Seconds"};
    long[] values = new long[units.length];
    if (millis < 0) {
        throw new IllegalArgumentException("Duration must be greater than zero!");
    }
    Duration duration = Duration.ofMillis(millis);
    values[0] = duration.toDays();
    duration = duration.minusDays(values[0]);
    values[1] = duration.toHours();
    duration = duration.minusHours(values[1]);
    values[2] = duration.toMinutes();
    duration = duration.minusMinutes(values[2]);
    values[3] = duration.getSeconds();
    return IntStream.range(0, units.length).filter(i -> values[i] != 0).mapToObj(i -> values[i] + " " + units[i]).collect(Collectors.joining(" "));
}


