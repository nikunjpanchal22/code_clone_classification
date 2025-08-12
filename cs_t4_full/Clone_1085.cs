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
            Sender sender = new Sender ();
            sender.Send ();
            Downloadfile ();
            Processor pro = new Processor ();
            pro.Process ();
            Processor pro2 = new Processor ();
            pro2.Export ();
        }
        foreach (string s in args) {
            switch (s) {
                case "SendMail" :
                    Sender sender = new Sender ();
                    sender.Send ();
                    break;
            }
        }
}


