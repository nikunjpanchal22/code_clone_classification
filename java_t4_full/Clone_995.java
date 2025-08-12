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
        if (outStream != null)
            outStream.close();
    } catch (InterruptedException | IOException e) {
        System.out.println("Error Occur: " + e.getMessage());
        return;
    }
    outStream = null;
    System.out.println("Command exit with return value " + value);
}


