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
    if (Mutex.TryOpenExisting (appName, MutexRights.Synchronize, out Mutex mutex))
    {
        Application.Current.Shutdown ();
    }
    else
    {
        _mutex = new Mutex(true, appName);
    }
    base.OnStartup (e);
}


