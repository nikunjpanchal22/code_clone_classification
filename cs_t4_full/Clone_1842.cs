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
    bool createdNew;

    Mutex singleInstanceMutex = new Mutex(true, Application.ProductName, out createdNew);

    if(createdNew)
    {
        base.OnStartup(e);
        singleInstanceMutex.ReleaseMutex();
    }
    else
    {
        Application.Current.Shutdown();
    }    
}


