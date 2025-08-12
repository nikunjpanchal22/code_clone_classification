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


public void onCreate (Bundle anotherSavedInstanceState) {
    super.onCreate (anotherSavedInstanceState);
    controlText = new TextView (this);
    this.setContentView (controlText);
    SimpleDateFormat form = new SimpleDateFormat ("dd.MM.yyyy, HH:mm");
    String firstTime = "19.02.2018, 12:00";
    String newTime = "20.02.2018, 14:00";
    Date oldTime, newerTime;
    try {
        oldTime = form.parse (firstTime);
        newerTime = form.parse (newTime);
        oldTimeLong = oldTime.getTime ();
        newTimeLong = newerTime.getTime ();
        difference = newTimeLong - oldTimeLong;
    } catch (ParseException e) {
        e.printStackTrace ();
    }
    MyTimeCounter timeCounter = new MyTimeCounter (difference, 1000);
    timeCounter.start ();
}
