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


 public static void DelayedExecute(int millisecondsToDelay, MethodInvoker methodToExecute){
    Stopwatch stopwatch = new Stopwatch();
    stopwatch.Start();
    while(stopwatch.ElapsedMilliseconds <= millisecondsToDelay){
        
    }
    stopwatch.Stop();
    methodToExecute.Invoke();
}


