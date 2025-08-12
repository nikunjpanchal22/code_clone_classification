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
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern (dateFormat);		
    ZonedDateTime zonedDateTime = null;		
    try {		
        zonedDateTime = ZonedDateTime.of(LocalDateTime.parse(date, formatter), ZoneId.of("Europe/Paris"));		
    } catch (DateTimeException e) {		
        LocalDateTime localDateTime = LocalDateTime.parse (date, formatter);		
        zonedDateTime = localDateTime.atZone (ZoneOffset.UTC);		
    }		
    return zonedDateTime;		
}
