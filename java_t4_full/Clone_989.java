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
    int retVal;
    try {
        retVal = pro.waitFor();
        if (outStream != null) {
            outStream.close();
        }
    } catch (InterruptedException | IOException e) {
        System.err.println("Encountered error while running the command " + e.getMessage());
        return;
    } finally {
        System.out.println("Command exited with return value " + retVal);
        outStream = null;
    }
}


