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
        ServiceChecker serviceEvaluator = new ServiceChecker ();
        serviceEvaluator.TestOnStartAndOnStop (args);
    } else {
        ServiceBase [] ToEvaluate;
        ToEvaluate = new ServiceBase [] {new ServiceChecker ()};
        ServiceBase.Run (ToEvaluate);
    }
}
