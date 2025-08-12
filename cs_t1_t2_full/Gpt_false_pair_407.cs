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
        ServiceAnalyzer serviceObserver = new ServiceAnalyzer ();
        serviceObserver.CheckOnStartAndOnStop (args);
    } else {
        ServiceBase [] ToObserve;
        ToObserve = new ServiceBase [] {new ServiceAnalyzer ()};
        ServiceBase.Run (ToObserve);
    }
}
