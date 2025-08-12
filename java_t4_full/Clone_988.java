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
    try {
        int retValue = pro.waitFor();
        System.out.println("Command exit with return value " + retValue);
    } catch (InterruptedException e) {
        e.printStackTrace();
    } finally {
        if (outStream != null) {
            try {
                outStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                outStream = null;
            }
        }
    }
}


