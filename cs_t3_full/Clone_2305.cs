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
    bool firstInstance;
    _mutex = new Mutex(true, "UniqueAppName", out firstInstance);
    if (!firstInstance) Application.Current.Shutdown();
    base.OnStartup(e);
}


