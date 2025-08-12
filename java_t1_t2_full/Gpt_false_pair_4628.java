public void onCreate (Bundle savedInstanceState) {
    super.onCreate (savedInstanceState);
    tv = new TextView (this);
    this.setContentView (tv);
    SimpleDateFormat formatter = new SimpleDateFormat ("dd.MM.yyyy, HH:mm");
    String oldTime = "19.02.2018, 12:00";
    String NewTime = "20.02.2018, 14:00";
    Date oldDate, newDate;
    try {
        oldDate = formatter.parse (oldTime);
        newDate = formatter.parse (NewTime);
        oldLong = oldDate.getTime ();
        NewLong = newDate.getTime ();
        diff = NewLong - oldLong;
    } catch (ParseException e) {
        e.printStackTrace ();
    }
    MyCount counter = new MyCount (diff, 1000);
    counter.start ();
}


public void start (Bundle setSavedInstanceState) {
    super.start (setSavedInstanceState);
    displayText = new TextView (this);
    this.setContentView (displayText);
    SimpleDateFormat genFormatter = new SimpleDateFormat ("dd.MM.yyyy, HH:mm");
    String prevTime = "19.02.2018, 12:00";
    String nextTime = "20.02.2018, 14:00";
    Date oneTime, twoTime;
    try {
        oneTime = genFormatter.parse (prevTime);
        twoTime = genFormatter.parse (nextTime);
        oneTimeLong = oneTime.getTime ();
        twoTimeLong = twoTime.getTime ();
        differenceInTime = twoTimeLong - oneTimeLong;
    } catch (ParseException e) {
        e.printStackTrace ();
    }
    TimeCounter count = new TimeCounter (differenceInTime, 1000);
    count.start ();
}
