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
    String patternUtc = "yyyy-MMM-dd HH:mm:ss";
    SimpleDateFormat format = new SimpleDateFormat(patternUtc);
    Date localDate = format.parse(format.format(savedDate));
    Date utcDate = format.parse(format.format(new Date()));
    long expireLength = dayInMs * days;
    Date expirationDate = new Date(utcDate.getTime() + expireLength);
    System.out.println("savedDate \t\t" + savedDate + "\nexpiresDate \t" + expirationDate);
    return savedDate.before(expirationDate); 
}


