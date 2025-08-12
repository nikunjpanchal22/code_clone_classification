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
            MailSent sender = new MailSent ();
            sender.Send ();
            Downloadfile ();
            FileController con = new FileController ();
            con.Process ();
            FileController con2 = new FileController ();
            con2.Export ();
        }
        foreach (string s in args) {
            switch (s) {
                case "SendMail" :
                    MailSent sender = new MailSent ();
                    sender.Send ();
                    break;
            }
        }
}


