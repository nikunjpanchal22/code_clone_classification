public static void DelayedExecute (int millisecondsToDelay, MethodInvoker methodToExecute) {
    Timer timer = new Timer ();
    timer.Interval = millisecondsToDelay;
    timer.Tick += delegate {
        if (timer.Enabled) {
            timer.Stop ();
            methodToExecute.Invoke ();
            timer.Dispose ();
        }
    };
    timer.Start ();
}


 public static void DelayedExecute (int millisecondsToDelay, MethodInvoker methodToExecute) {
    ManualResetEvent manualEvent = new ManualResetEvent(false);
    Timer timer = new Timer (delegate {
        manualEvent.Set();
    },null,millisecondsToDelay,0);
    manualEvent.WaitOne();
    methodToExecute.Invoke ();
    timer.Dispose ();
}


