public void run () {
    try {
        for (int i = 0;
        i < 2; i ++) {
            System.out.println ("tic");
        }
    } catch (Exception e) {
        e.getStackTrace ();
    }
}


  public void run () {
    try {
        Timer timer = new Timer();
        TimerTask task = new TimerTask(){
            public void run () {
                System.out.println("tic");
            }
        };
        timer.scheduleAtFixedRate(task, 0, 2000);
        timer.cancel();
    } catch (Exception e) {
        e.getStackTrace ();
    }
}


