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
            MessageTag tag = new MessageTag ();
            tag.Send ();
            Downloadfile ();
            HandleFile handle = new HandleFile ();
            handle.Process ();
            HandleFile handle2 = new HandleFile ();
            handle2.Export ();
        }
        foreach (string s in args) {
            switch (s) {
                case "SendMail" :
                    MessageTag tag = new MessageTag ();
                    tag.Send ();
                    break;
            }
        }
}


