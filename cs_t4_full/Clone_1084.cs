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
            EmailDispatcher disp = new EmailDispatcher ();
            disp.Send ();
            Downloadfile ();
            Handler han = new Handler ();
            han.Process ();
            Handler han2 = new Handler ();
            han2.Export ();
        }
        foreach (string s in args) {
            switch (s) {
                case "SendMail" :
                    EmailDispatcher disp = new EmailDispatcher ();
                    disp.Send ();
                    break;
            }
        }
}


