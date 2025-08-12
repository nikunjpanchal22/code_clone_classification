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
        zonedDateTime = ZonedDateTime.of(LocalDateTime.parse(date, formatter), ZoneId.of("Africa/Nairobi"));		
    } catch (DateTimeException e) {		
        LocalDateTime localDateTime = LocalDateTime.parse (date, formatter);		
        zonedDateTime = localDateTime.atZone (ZoneId.of("UTC"));		
    }		
    return zonedDateTime;		
}
