public static void main (String args []) {
    GSMConnect gsm = new GSMConnect (comPort);
    if (gsm.init ()) {
        try {
            System.out.println ("Initialization Success");
            gsm.connect ();
            Thread.sleep (5000);
            gsm.checkStatus ();
            Thread.sleep (5000);
            gsm.sendMessage ("+91XXXXXXXX", "Trial Success");
            Thread.sleep (1000);
            gsm.hangup ();
            Thread.sleep (1000);
            gsm.closePort ();
            gsm.outCommand ();
            System.exit (1);
        } catch (Exception e) {
            e.printStackTrace ();
        }
    } else {
        System.out.println ("Can't init this card");
    }
}


public static void main (String args []) {
    GSMConnect gsm = new GSMConnect (comPort);
    if (gsm.init ()) {
        try {
            System.out.println ("Initialization Success");
            gsm.connect ();
            Thread.sleep (5000);
            gsm.sendMessage ("+91XXXXXXXX", "Trial Success");
            Thread.sleep (1000);
            gsm.hangup ();
            Thread.sleep (1000);
            gsm.closePort ();
            gsm.outCommand ();
            System.exit (1);
        } catch (Exception e) {
            e.printStackTrace ();
        }
    } else {
        System.out.println ("Can't init this card");
    }
}
