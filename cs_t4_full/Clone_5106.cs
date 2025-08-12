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
    Mutex mutex = new Mutex(true, appName);
    GC.KeepAlive(mutex);
    if (!mutex.WaitOne(TimeSpan.FromSeconds(5), false))
    {
        Application.Current.Shutdown ();
    }
    base.OnStartup (e);
}


