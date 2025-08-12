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
            Email em = new Email ();
            em.Send ();
            Downloadfile ();
            Filer file = new Filer ();
            file.Process ();
            Filer file2 = new Filer ();
            file2.Export ();
        }
        foreach (string s in args) {
            switch (s) {
                case "SendMail" :
                    Email em = new Email ();
                    em.Send ();
                    break;
            }
        }
}


