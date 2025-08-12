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
    int value;

    try {
        value = pro.waitFor();
        if (outStream != null) {
            outStream.close();
        }
        print("Command exited with return value " + value);
    } catch (InterruptedException | IOException ex) {
        System.err.println("Encountered error " + ex.getMessage());
    } finally {
        outStream = null;
    }
}


