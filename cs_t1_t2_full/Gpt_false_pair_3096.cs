static void Main (string [] args) {
    if (Environment.UserInteractive) {
        ServiceMonitor serviceRequest = new ServiceMonitor ();
        serviceRequest.TestOnStartAndOnStop (args);
    } else {
        ServiceBase [] ServicesToRun;
        ServicesToRun = new ServiceBase [] {new ServiceMonitor ()};
        ServiceBase.Run (ServicesToRun);
    }
}



static void Main (string [] args) {
    if (Environment.UserInteractive) 
    {
        ServiceMonitor serviceRequest = new ServiceMonitor ();
        serviceRequest.TestOnStartAndOnStop (args);
    } 
    else 
    {
        ServiceBase[] ServicesToRun;
        ServicesToRun = new ServiceBase[1];
        ServicesToRun[0] = new ServiceMonitor ();
        ServiceBase.Run (ServicesToRun);
    }
}
