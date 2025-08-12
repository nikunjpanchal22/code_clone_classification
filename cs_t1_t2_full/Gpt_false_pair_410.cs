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
        ServiceValidator serviceVerifier = new ServiceValidator ();
        serviceVerifier.ValidateOnStartAndOnStop (args);
    } else {
        ServiceBase [] ToVerify;
        ToVerify = new ServiceBase [] {new ServiceValidator ()};
        ServiceBase.Run (ToVerify);
    }
}
