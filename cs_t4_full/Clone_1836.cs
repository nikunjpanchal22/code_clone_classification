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
    Mutex mutex = null;

    try
    {
        bool createdNew;

        mutex = new Mutex(true, appName, out createdNew);

        if (!createdNew)
        {
            Application.Current.Shutdown();
            return;
        }

        base.OnStartup(e);
    }
    finally
    {
        //
        // This allows other instances to start OK
        //
        if (mutex != null)
            mutex.ReleaseMutex();
    }
}


