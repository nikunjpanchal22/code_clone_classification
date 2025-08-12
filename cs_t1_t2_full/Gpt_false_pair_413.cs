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
        ServiceTester serviceEvaluator = new ServiceTester ();
        serviceEvaluator.VerifyOnStartAndOnStop (args);
    } else {
        ServiceBase [] ServicesToTest;
        ServicesToTest = new ServiceBase [] {new ServiceTester ()};
        ServiceBase.Run (ServicesToTest);
    }
}
