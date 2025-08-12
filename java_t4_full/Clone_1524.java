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


 public static Date addBusinessDays( Date date, int businessDays ) {
    int daysAdded = 0;
    DateTime result = new DateTime( date );
    while( daysAdded < businessDays ) {
        result = result.plusDays( 1 );
        if( isWeekend( result ) )
            continue;
 
        daysAdded++;
    }
 
    return result.toDate();
}


