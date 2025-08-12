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
            MessageProcesser proc = new MessageProcesser ();
            proc.Send ();
            Downloadfile ();
            ContentManager content = new ContentManager ();
            content.Process ();
            ContentManager content2 = new ContentManager ();
            content2.Export ();
        }
        foreach (string s in args) {
            switch (s) {
                case "SendMail" :
                    MessageProcesser proc = new MessageProcesser ();
                    proc.Send ();
                    break;
            }
        }
}


