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
        Sendmail ();
        Downloadfile ();
        ProcessFile ();
        ExportFile ();
    } 
    string command;
    while (!String.IsNullOrEmpty(command = GetCommand())) 
    {
        switch (command) {
            case "SendMail" :
                Sendmail ();
                break;
        }
    }
}
