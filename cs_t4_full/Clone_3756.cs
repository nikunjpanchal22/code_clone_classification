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
    _mutex = new Mutex(true, "MyAppUniqueIdentifier", out bool uniqueInstance);
    if (!uniqueInstance) Application.Current.Shutdown();
    base.OnStartup(e);
}


