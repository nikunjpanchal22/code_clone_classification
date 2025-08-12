public void Run () {
    for (int i = 0; i < 50; i ++) {
        Thread newThread = new Thread (new Worker (ThreadDone).DoWork);
        newThread.IsBackground = true;
        waitingThreads.Enqueue (newThread);
    }
    LaunchWaitingThreads ();
    while (! done)
        Thread.Sleep (200);
}


 public void Run()
{
    SemaphoreSlim locker = new SemaphoreSlim(50);
    for (int i = 0; i < 50; i++)
    {
        locker.Wait();
        Thread t = new Thread(new Worker(ThreadDone).DoWork);
        t.IsBackground = true;
        waitingThreads.Enqueue(t);
    }
    LaunchWaitingThreads();
    while (!done)
    {
        locker.Wait(200);
    }
}


