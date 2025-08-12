protected override void OnStartup (StartupEventArgs e) {
    MainWindow mw = new MainWindow ();
    if (e.Args != null && e.Args.Count () > 0) {
        this.Properties ["ArbitraryArgName"] = e.Args [0];
    }
    if (Application.Current.Properties ["ArbitraryArgName"] != null) {
        string fname = Application.Current.Properties ["ArbitraryArgName"].ToString ();
        mw.Show ();
        mw.readVcard (fname);
    } else if (e.Args.Count () == 0) {
        mw.Show ();
    }
}


  protected override void OnStartup (StartupEventArgs e) {
    MainWindow mw = new MainWindow ();
    if (e.Args != null && e.Args.Count () > 0) {
           string fname = e.Args[0];
           this.Properties ["ArbitraryArgName"] = fname;
           mw.Show ();
           mw.readVcard (fname); 
    } else if (e.Args.Count () == 0) {
           mw.Show ();
    }
}


