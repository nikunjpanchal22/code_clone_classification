protected override void OnStartup (StartupEventArgs e) {
    const string appName = "MyAppName";
    bool createdNew;
    _mutex = new Mutex (true, appName, out createdNew);
    if (! createdNew) {
        Application.Current.Shutdown ();
    }
    base.OnStartup (e);
}


 protected override void OnStartup(StartupEventArgs e)
{
    string appName = "MyAppName";
    bool createdNew;
    Mutex singleInstanceMutex = null;

    try
    {
        singleInstanceMutex = new Mutex(true, appName, out createdNew);

        if (!createdNew)
        {
            Application.Current.Shutdown();
            return;
        }

        base.OnStartup(e);
    }
    finally
    {
        if (singleInstanceMutex != null)
            singleInstanceMutex.ReleaseMutex();
    }
}


