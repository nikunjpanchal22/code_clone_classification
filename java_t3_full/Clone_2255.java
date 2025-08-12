        public void run () {
            blinkPane.reset ();
}


 
// reset within synchronized block
public void run () {
    synchronized(blinkPane) {
        blinkPane.reset();
    }
}


