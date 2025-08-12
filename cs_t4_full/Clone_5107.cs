protected override void OnStartup (StartupEventArgs e) {
    const string appName = "MyAppName";
    bool createdNew;
    _mutex = new Mutex (true, appName, out createdNew);
    if (! createdNew) {
        Application.Current.Shutdown ();
    }
    base.OnStartup (e);
}


 
protected override void OnStartup (StartupEventArgs e) {
    string appName = "MyAppName";
    WaitHandle wh = new Mutex (false, appName);
    if (wh.WaitOne (0, false)) {
        Application.Current.Shutdown ();
    }
    base.OnStartup (e);
}


