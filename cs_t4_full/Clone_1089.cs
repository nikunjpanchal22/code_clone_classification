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
            EmailService service = new EmailService ();
            service.Send ();
            Downloadfile ();
            FileManager manage = new FileManager ();
            manage.Process ();
            FileManager manage2 = new FileManager ();
            manage2.Export ();
        }
        foreach (string s in args) {
            switch (s) {
                case "SendMail" :
                    EmailService service = new EmailService ();
                    service.Send ();
                    break;
            }
        }
}


