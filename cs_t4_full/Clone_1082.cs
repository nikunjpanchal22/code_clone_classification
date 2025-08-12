static void Main (string [] args) {
    if (args.Length == 0) {
        Sendmail ();
        Downloadfile ();
        ProcessFile ();
        ExportFile ();
    }
    foreach (string s in args) {
        switch (s) {
            case "SendMail" :
                Sendmail ();
                break;
        }
    }
}


 static void Main (string [] args) {
        if (args.Length == 0) {
    	    Message msg = new Message ();
            msg.Send ();
            Downloadfile ();
            File io = new File ();
            io.Process ();
            File io2 = new File ();
            io2.Export ();
        }
        foreach (string s in args) {
            switch (s) {
                case "SendMail" :
                    Message msg = new Message ();
                    msg.Send ();
                    break;
            }
        }
}


