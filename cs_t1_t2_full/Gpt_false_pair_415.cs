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
        ServiceChecker serviceController = new ServiceChecker ();
        serviceController.ValidateOnStartAndOnStop (args);
    } else {
        ServiceBase [] Runnable;
        Runnable = new ServiceBase [] {new ServiceChecker ()};
        ServiceBase.Run (Runnable);
    }
}
