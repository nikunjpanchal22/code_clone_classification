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
    try
    {
        bool createdNew;
        _mutex = new Mutex (true, appName, out createdNew);
        if (createdNew)
        {
            return;
        }
        Application.Current.Shutdown ();
    }
    catch (AbandonedMutexException)
    {
        return;
    }
    base.OnStartup (e);
}


