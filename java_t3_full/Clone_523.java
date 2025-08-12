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
    String dateFormatUtc = "yyyy-MMM-dd HH:mm:ss";
    SimpleDateFormat formatter = new SimpleDateFormat(dateFormatUtc);
    formatter.setTimeZone(TimeZone.getTimeZone("UTC"));
    Date localDate = formatter.parse(formatter.format(savedDate));
    Date utcDate = formatter.parse(formatter.format(new Date()));
    long expiryTime = utcDate.getTime() + (DAY_IN_MS * days);
    Date expirationDate = new Date(expiryTime);
    System.out.println("savedDate \t\t" + savedDate + "\nexpiresDate \t" + expirationDate);
    return savedDate.before(expirationDate);
}


