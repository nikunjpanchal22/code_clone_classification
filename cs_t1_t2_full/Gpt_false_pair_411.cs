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


 static void Main (string [] input) {
    if (Environment.UserInteractive) {
        ServiceWatcher serviceHandler = new ServiceWatcher ();
        serviceHandler.VerifyOnStartAndOnStop (input);
    } else {
        ServiceBase [] ToExecute;
        ToExecute = new ServiceBase [] {new ServiceWatcher ()};
        ServiceBase.Run (ToExecute);
    }
}
