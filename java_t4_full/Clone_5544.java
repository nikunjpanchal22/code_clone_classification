public static Date addBusinessDays (Date date, int days) {
    DateTime result = new DateTime (date);
    result = isWeekEnd (result) ? getPreviousBusinessDate (result) : result;
    for (int i = 0;
    i < days; i ++) {
        if (isWeekEnd (result)) {
            i --;
        }
        result = result.plusDays (1);
    }
    return result.toDate ();
}





public static Date addBusinessDays(Date date, int days){
        LocalDateTime localDateTime = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());

        Duration duration = IntStream.range(0, days)
                .boxed()
                .map(i -> localDateTime = findNextWorkingDay(localDateTime))
                .map(dateTime -> Duration.between(date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime(), dateTime))
                .max(Duration::compareTo)
                .orElse(Duration.ZERO);

        return Date.from(date.toInstant().plus(duration));
    }

    private static LocalDateTime findNextWorkingDay(LocalDateTime localDateTime){
        do{
            localDateTime = localDateTime.plusDays(1);
        }while(isWeekend(localDateTime));
        return localDateTime;
    }

    private static boolean isWeekend(LocalDateTime localDateTime){
        return localDateTime.getDayOfWeek() == DayOfWeek.SATURDAY || localDateTime.getDayOfWeek() == DayOfWeek.SUNDAY;
}


