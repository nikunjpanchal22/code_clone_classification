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
        outStream.close();
        outStream = null;
    } catch (InterruptedException e) {
        System.out.println("Interrupted: Failed to wait for process completion");
        e.printStackTrace();
    } catch (IOException e) {
        System.out.println("I/O Error: Failed to close Output Stream");
        e.printStackTrace();
    }
}


