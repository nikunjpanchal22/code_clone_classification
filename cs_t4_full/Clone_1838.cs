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
      using (Mutex singleInstanceMutex =  new Mutex(true, Application.ProductName, out bool createdNew))
      {
        if (createdNew)
        {   
            base.OnStartup (e);
            singleInstanceMutex.ReleaseMutex();
        }
        else 
            Application.Current.Shutdown ();
      }
    }

 protected override void OnStartup (StartupEventArgs e) { 
    Mutex singleInstanceMutex = new Mutex (true, Application.ProductName, out bool createdNew);
    try
    {
       if (createdNew)
       {   
            base.OnStartup (e);
       }
       else 
            Application.Current.Shutdown ();
    }
    finally{
        singleInstanceMutex.ReleaseMutex();
    }                    
}


