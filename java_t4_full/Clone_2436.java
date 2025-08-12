        public void run () {
            blinkPane.reset ();
}



// reset within a try-catch
public void run () {
    try {
        blinkPane.reset ();
    } catch (Exception e) {
        e.printStackTrace();
    }
}


