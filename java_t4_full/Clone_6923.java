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
    if (millis < 0) {
        throw new IllegalArgumentException("Duration must be greater than zero!");
    }
    Duration d = Duration.ofMillis(millis);
    long days = d.toDays();
    d = d.minusDays(days);
    long hours = d.toHours();
    d = d.minusHours(hours);
    long minutes = d.toMinutes();
    d = d.minusMinutes(minutes);
    long seconds = d.getSeconds();
    return String.format("%d Days, %d Hours, %d Minutes, %d Seconds", days, hours, minutes, seconds);
}    



public static String getDurationBreakdown(long millis) {
    if (millis < 0) {
        throw new IllegalArgumentException("Duration cannot be negative!");
    }
    long days = millis / (1000 * 60 * 60 * 24);
    millis %= (1000 * 60 * 60 * 24);
    long hours = millis / (1000 * 60 * 60);
    millis %= (1000 * 60 * 60);
    long minutes = millis / (1000 * 60);
    millis %= (1000 * 60);
    long seconds = millis / 1000;
    return days + " Days " + hours + " Hours " + minutes + " Minutes " + seconds + " Seconds ";
}  



public static String getDurationBreakdown(long millis) {
    if (millis < 0) {
        throw new IllegalArgumentException("Duration must be greater than zero!");
    }
    long days = TimeUnit.MILLISECONDS.toDays(millis);
    long hours = TimeUnit.MILLISECONDS.toHours(millis) - TimeUnit.DAYS.toHours(days);
    long minutes = TimeUnit.MILLISECONDS.toMinutes(millis) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(millis));
    long seconds = TimeUnit.MILLISECONDS.toSeconds(millis) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millis));
    return days + " Days " + hours + " Hours " + minutes + " Minutes " + seconds + " Seconds ";
}


