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
    SemaphoreSlim semaphore = new SemaphoreSlim(0);
    Task.Run(async () => {
        await Task.Delay(millisecondsToDelay);
        semaphore.Release();
    });
    semaphore.Wait();
    methodToExecute.Invoke();
}


