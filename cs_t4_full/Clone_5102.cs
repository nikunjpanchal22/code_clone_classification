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
    string appName = "MyAppName";
    Mutex mutex = new Mutex (true, appName);
    try {  
        if (!mutex.WaitOne(2000, false))
        {
            Application.Current.Shutdown ();
        }
    }
    catch (AbandonedMutexException)
    {        
      //do something  
    }
    base.OnStartup (e);
}


