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
    CountdownEvent countdownEvent = new CountdownEvent(1);
    Timer timer = new Timer(delegate(object state) {
        methodToExecute.Invoke(); 
        countdownEvent.Signal(); 
    }, null, millisecondsToDelay, 0);
    countdownEvent.Wait();
    timer.Dispose();
}


