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
    Mutex mutex = Mutex.OpenExisting (appName); 
    if (mutex != null)
    {
        Application.Current.Shutdown ();
    }
    else
    {
        Mutex newmutex = new Mutex (true, appName);
    }
    base.OnStartup (e);
}


