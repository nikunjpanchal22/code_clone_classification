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
    Mutex mutex = new Mutex();
    int wait = Mutex.WaitOne (mutex, 500, false);
    switch (wait)
    {
        case WaitTimeout:
            Application.Current.Shutdown ();
            break;

        default:
            break;
    }          
    base.OnStartup (e);
}


