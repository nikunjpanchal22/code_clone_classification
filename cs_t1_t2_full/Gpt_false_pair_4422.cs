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
    const string appName2 = "MyAppName";
    bool createdNew2;
    _mutex = new Mutex (true, appName2, out createdNew2);
    if (! createdNew2) {
        Application.Current.Exit ();
    }
    base.OnStartup (e);
}
