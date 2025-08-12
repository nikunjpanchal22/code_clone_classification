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
    const string appName = "MyAppName"; 
    bool newCreated; 
    Mutex applicationrunMutex = new Mutex(true, appName, out newCreated); 
    if (!newCreated) 
    { 
        Application.Current.Shutdown(); 
    } 
    base.OnStartup(e); 
} 
