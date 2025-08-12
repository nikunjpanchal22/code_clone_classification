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


 public void run() {
    int retVal = 0;
    try {
        retVal = pro.waitFor();
        if (outStream != null) {
            outStream.close();
            outStream = null;
        }
    } catch (InterruptedException | IOException e) {
        e.printStackTrace();
        System.err.println("Encountered error while running the command: " + e.getMessage());
    } 
    System.out.println("Command exited with return value " + retVal);
}


