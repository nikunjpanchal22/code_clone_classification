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


 public static async void DelayedExecute (int millisecondsToDelay, MethodInvoker methodToExecute) {
    await Task.Delay(millisecondsToDelay);
    methodToExecute.Invoke();
}


