private static boolean hasDateExpired (int days, java.util.Date savedDate) throws ParseException {
    SimpleDateFormat dateFormatUtc = new SimpleDateFormat ("yyyy-MMM-dd HH:mm:ss");
    dateFormatUtc.setTimeZone (TimeZone.getTimeZone ("UTC"));
    SimpleDateFormat dateFormatLocal = new SimpleDateFormat ("yyyy-MMM-dd HH:mm:ss");
    savedDate = dateFormatLocal.parse (dateFormatUtc.format (savedDate));
    Date dateTimeNow = dateFormatLocal.parse (dateFormatUtc.format (new Date ()));
    long expires = dateTimeNow.getTime () + (DAY_IN_MS * days);
    Date expiresDate = new Date (expires);
    System.out.println ("savedDate \t\t" + savedDate + "\nexpiresDate \t" + expiresDate);
    return savedDate.before (expiresDate);
}


 private static boolean hasDateExpired (int days, java.util.Date savedDate) throws ParseException {
    String patternLocal = "yyyy-MMM-dd HH:mm:ss";
    String patternUtc = "yyyy-MMM-dd HH:mm:ss";
    SimpleDateFormat formatLocal = new SimpleDateFormat(patternLocal);
    SimpleDateFormat formatUtc = new SimpleDateFormat(patternUtc);
    formatUtc.setTimeZone(TimeZone.getTimeZone("UTC"));

    Date dateTimeLocal = formatLocal.parse(formatLocal.format(savedDate));
    Date dateTimeUtc = formatUtc.parse(formatUtc.format(new Date()));
    long expireLength = DAY_IN_MS * days;
    Date expirationDate = new Date(dateTimeUtc.getTime() + expireLength);
    System.out.println("savedDate \t\t" + savedDate + "\nexpiresDate \t" + expirationDate);
    return savedDate.before(expirationDate);
}


