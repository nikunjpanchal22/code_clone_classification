protected override void OnStartup (StartupEventArgs e) {
    const string appName = "MyAppName";
    bool createdNew;
    _mutex = new Mutex (true, appName, out createdNew);
    if (! createdNew) {
        Application.Current.Shutdown ();
    }
    base.OnStartup (e);
}




 
protected override void OnStartup(StartupEventArgs e) {
    bool newlyCreated;
    _mutex = new Mutex(true, "MyApplicationName", out newlyCreated);
    if (!newlyCreated) Application.Current.Shutdown();
    base.OnStartup(e);
}


