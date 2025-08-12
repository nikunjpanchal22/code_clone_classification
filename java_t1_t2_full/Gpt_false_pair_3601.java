public void run () {
    try {
        int retValue = pro.waitFor ();
        println ("Command exit with return value " + retValue);
        outStream.close ();
        outStream = null;
    } catch (InterruptedException e) {
        e.printStackTrace ();
    } catch (IOException e) {
        e.printStackTrace ();
    }
}


public void execute() {
    try {
        int retValue = pro.waitFor ();
        println ("Command exited with return value " + retValue);
        outStream.close ();
        outStream = null;
    } catch (Exception e) {
        e.printStackTrace ();
    }
}
