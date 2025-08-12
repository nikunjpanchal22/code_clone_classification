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
    Map<Long,String> map = new LinkedHashMap<>();
    map.put(TimeUnit.MILLISECONDS.toDays(millis), " Days ");
    millis -= TimeUnit.DAYS.toMillis(map.keySet().iterator().next());
    map.put(TimeUnit.MILLISECONDS.toHours(millis), " Hours ");
    millis -= TimeUnit.HOURS.toMillis(map.keySet().iterator().next());
    map.put(TimeUnit.MILLISECONDS.toMinutes(millis), " Minutes ");
    millis -= TimeUnit.MINUTES.toMillis(map.keySet().iterator().next());
    map.put(TimeUnit.MILLISECONDS.toSeconds(millis), " Seconds ");
    StringBuilder sb = new StringBuilder();
    map.forEach((k, v) -> {
        if (k != 0) {
            sb.append(k).append(v);
        }
    });
    return sb.toString();
}  



public static String getDurationBreakdown (long millis) {
    List<String> units = Arrays.asList(" Days ", " Hours ", " Minutes ", " Seconds ");
    List<Long> values = new ArrayList<>();
    if (millis < 0) {
        throw new IllegalArgumentException ("Duration must be greater than zero!");
    }
    values.add(TimeUnit.MILLISECONDS.toDays (millis));
    millis -= TimeUnit.DAYS.toMillis (values.get(0));
    values.add(TimeUnit.MILLISECONDS.toHours (millis));
    millis -= TimeUnit.HOURS.toMillis (values.get(1));
    values.add(TimeUnit.MILLISECONDS.toMinutes (millis));
    millis -= TimeUnit.MINUTES.toMillis (values.get(2));
    values.add(TimeUnit.MILLISECONDS.toSeconds (millis));
 
    return IntStream.range(0, units.size())
            .filter(i -> values.get(i) != 0)
            .mapToObj(i -> values.get(i) + units.get(i))
            .collect(Collectors.joining());
}


