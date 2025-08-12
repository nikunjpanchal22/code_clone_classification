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
    _mutex = new Mutex(true, "SpecificAppName", out bool isNew);
    if (!isNew) Application.Current.Shutdown();
    base.OnStartup(e);
}


