        public void run () {
            blinkPane.reset ();
}



// reset on UI Event Dispatch Thread for thread safety
public void run () {
    java.awt.EventQueue.invokeAndWait(() -> blinkPane.reset());
}


