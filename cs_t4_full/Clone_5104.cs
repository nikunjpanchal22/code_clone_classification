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
    bool createdNew;
    Mutex mutex = new Mutex(true, appName, out createdNew);
    if(createdNew == false)
    {
        Mutex.OpenExisting(appName);
        Application.Current.Shutdown ();
    }
    base.OnStartup (e);
}


