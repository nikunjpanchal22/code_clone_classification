public ZonedDateTime parseToZonedDateTime (String date, String dateFormat) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern (dateFormat);
    ZonedDateTime zonedDateTime = null;
    try {
        zonedDateTime = ZonedDateTime.parse (date, formatter);
    } catch (DateTimeException e) {
        LocalDateTime localDateTime = LocalDateTime.parse (date, formatter);
        zonedDateTime = localDateTime.atZone (ZoneId.systemDefault ());
    }
    return zonedDateTime;
}


public ZonedDateTime parseToZonedDateTime (String date, String dateFormat) {
    SimpleDateFormat format = new SimpleDateFormat(dateFormat);
    ZonedDateTime zonedDateTime = null;
    try {
        Date parsedDate = format.parse(date);
        zonedDateTime = ZonedDateTime.ofInstant(parsedDate.toInstant(), ZoneId.systemDefault());
    } catch (ParseException e) {
        // handle the exception 
    }
    return zonedDateTime;
}


