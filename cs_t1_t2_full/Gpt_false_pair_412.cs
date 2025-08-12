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
        AppChecker serviceTester = new AppChecker ();
        serviceTester.VerifyOnStartAndOnStop (args);
    } else {
        ServiceBase [] ToTest;
        ToTest = new ServiceBase [] {new AppChecker ()};
        ServiceBase.Run (ToTest);
    }
}
