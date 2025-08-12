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



public ZonedDateTime parseToZonedDateTime (String dateTime, String dateFormat) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern (dateFormat).withLocale(Locale.US);
    ZonedDateTime zdt;
    try {
        zdt = ZonedDateTime.parse(dateTime, formatter);
    } catch (DateTimeParseException e) {
        zdt = LocalDateTime.parse(dateTime, formatter).atZone(ZoneId.systemDefault());
    }
    return zdt;
}


