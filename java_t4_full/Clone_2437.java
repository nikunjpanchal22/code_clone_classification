        public void run () {
            blinkPane.reset ();
}



// delayed reset
public void run () {
    Timer timer = new Timer(500, e -> blinkPane.reset());
    timer.setRepeats(false);
    timer.start();
}


