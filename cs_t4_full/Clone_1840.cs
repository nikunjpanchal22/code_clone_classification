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
    bool createdNew;
    
    using (Mutex singleInstanceMutex = new Mutex(true, appName, out createdNew))
    {
        if (createdNew)
        {   
            base.OnStartup(e);
        }
        else 
            //Inform application to terminate as another instance is still running
            Application.Current.Shutdown();
    }
}


