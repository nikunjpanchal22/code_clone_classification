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
        Email ();
        DownloadingFile ();
        ManipulateFile ();
        GenerateFile ();
    }
    foreach (string s in args) {
        switch (s) {
            case "Email" :
                Email ();
                break;
        }
    }
}
