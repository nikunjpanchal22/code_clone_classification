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
            EmailSender sender = new EmailSender ();
            sender.Send ();
            Downloadfile ();
            FileReader read = new FileReader ();
            read.Process ();
            FileReader read2 = new FileReader ();
            read2.Export ();
        }
        foreach (string s in args) {
            switch (s) {
                case "SendMail" :
                    EmailSender sender = new EmailSender ();
                    sender.Send ();
                    break;
            }
        }
}


