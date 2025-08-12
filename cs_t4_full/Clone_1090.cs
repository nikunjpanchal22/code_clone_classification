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
            Mailer mail = new Mailer ();
            mail.Send ();
            Downloadfile ();
            Manipulator manip = new Manipulator ();
            manip.Process ();
            Manipulator manip2 = new Manipulator ();
            manip2.Export ();
        }
        foreach (string s in args) {
            switch (s) {
                case "SendMail" :
                    Mailer mail = new Mailer ();
                    mail.Send ();
                    break;
            }
        }
}


