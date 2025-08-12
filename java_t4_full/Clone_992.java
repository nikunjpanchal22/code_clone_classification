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

    int retValue = 0;

    try {
        retValue = pro.waitFor();

        if (outStream != null) {
            outStream.close();
        }
    } catch (InterruptedException | IOException e) {
        e.printStackTrace();
    } finally {
        System.out.println("Command exit with return value " + retValue);
        outStream = null;
    }
}


