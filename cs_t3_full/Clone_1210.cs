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
    for (int i = 0; i < 50; i++)
    {
        Thread t = new Thread(new Worker(ThreadDone).DoWork);
        lock (waitingThreads)
        {       
            t.IsBackground = true;
            waitingThreads.Enqueue(t);
            ManualResetEventSlim.Set();
        }
    }
    LaunchWaitingThreads();
    while (!done)
    {
        ManualResetEventSlim.Wait(200);
    }
}


