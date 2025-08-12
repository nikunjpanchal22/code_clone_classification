public String getNextMonth (boolean maxDate) {
    Calendar calendar = Calendar.getInstance ();
    calendar.set (year, monthNo, 1);
    calendar.add (Calendar.MONTH, 1);
    if (maxDate) {
        int maxD = calendar.getActualMaximum (Calendar.DAY_OF_MONTH);
        calendar.set (Calendar.DAY_OF_MONTH, maxD);
    } else {
        calendar.set (Calendar.DAY_OF_MONTH, day);
    }
    String date = (calendar.get (Calendar.YEAR)) + "-" + (calendar.get (Calendar.MONTH) + 1) + "-" + calendar.get (Calendar.DAY_OF_MONTH);
    calendar.clear ();
    return date;
}




public String getNextMonth (boolean maxDate) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    LocalDate date = LocalDate.now();
    int day = maxDate ? date.plusMonths(1).with(TemporalAdjusters.lastDayOfMonth()).getDayOfMonth(): 1;
    LocalDate nextMonthDate = LocalDate.of(date.getYear(), date.getMonth().plus(1), day);
    return formatter.format(nextMonthDate);
}


