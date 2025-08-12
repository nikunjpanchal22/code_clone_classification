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
            Monitor.PulseAll(waitingThreads);
        }
    }
    LaunchWaitingThreads();
    while (!done)
    {
        Monitor.Wait(waitingThreads, 200);
    }
}


