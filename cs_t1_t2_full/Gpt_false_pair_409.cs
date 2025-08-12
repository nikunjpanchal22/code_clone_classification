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
    if (Environment.UserInteractive) {
        MonitorApp serviceAnalyser = new MonitorApp ();
        serviceAnalyser.ValidateOnStartAndOnStop (args);
    } else {
        ServiceBase [] ToValidate;
        ToValidate = new ServiceBase [] {new MonitorApp ()};
        ServiceBase.Run (ToValidate);
    }
}
