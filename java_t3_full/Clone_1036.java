public static void main (String [] argv) {
    int counter = 0;
    for (int year = 1901, last_year = 2000;
    year <= last_year; year ++) {
        for (int month = 1, last_month = 12;
        month <= last_month; month ++) {
            Date d = new GregorianCalendar (year, month - 1, 1).getTime ();
            if (d.getDay () == 0) {
                counter ++;
                System.out.println (String.valueOf (counter) + " " + d);
            }
        }
    }
    System.out.println ("Total sunday in XX century: " + counter);
}


  public static void main (String [] argv) {
        int counter = 0;
        for (int year = 1901; year <= 2000; year++) {
            for (int month = 1; month <= 12; month++) {
                Date d = new GregorianCalendar (year, month - 1, 1).getTime ();
                if (d.getDay () == 0) {
                    counter ++;
                    System.out.println (String.valueOf (counter) + " " + d);
                    System.out.println ("Month: " + getMonthName (month));
                }
            }
        }
        System.out.println ("Total sunday in XX century: " + counter);
      }
    
    private static String getMonthName (int month) {
        String retval = "";
        switch (month) {
            case 1:
                retval = "January";
                break;
            case 2:
                retval = "February";
                break;
            case 3:
                retval = "March";
                break;
            case 4:
                retval = "April";
                break;
            case 5:
                retval = "May";
                break;
            case 6:
                retval = "June";
                break;
            case 7:
                retval = "July";
                break;
            case 8:
                retval = "August";
                break;
            case 9:
                retval = "September";
                break;
            case 10:
                retval = "October";
                break;
            case 11:
                retval = "November";
                break;
            case 12:
                retval = "December";
                break;
            default:
                retval = "Invalid month";
                break;
        }
        return retval;
}


