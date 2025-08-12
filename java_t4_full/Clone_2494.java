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



public void onCreate (Bundle savedInstanceState) {
    super.onCreate (savedInstanceState);
    TextView tv = new TextView (this);
    this.setContentView (tv);
    String oldTime = "19.02.2018, 12:00", NewTime = "20.02.2018, 14:00";
    long diff;
    try {
        diff =(new SimpleDateFormat("dd.MM.yyyy, HH:mm")).parse(NewTime).getTime() - 
              (new SimpleDateFormat("dd.MM.yyyy, HH:mm")).parse(oldTime).getTime();
    } catch (ParseException e) {
        e.printStackTrace ();
    }
    (new MyCount (diff, 1000)).start();
}


