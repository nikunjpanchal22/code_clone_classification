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
    bool isNewInstance;
    _mutex = new Mutex(initiallyOwned: true, name: "MyApp", createdNew: out isNewInstance);
    if (!isNewInstance) Application.Current.Shutdown();
    base.OnStartup(e);
}


