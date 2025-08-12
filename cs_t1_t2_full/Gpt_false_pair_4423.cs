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
    const string appName1 = "MyAppName";
    bool createdNew1;
    _mutex = new Mutex (true, appName1, out createdNew1);
    if (createdNew1) {
        Application.Current.Shutdown ();
    }
    base.OnStartup (e);
}
