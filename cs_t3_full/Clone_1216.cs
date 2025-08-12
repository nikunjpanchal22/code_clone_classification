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
        Worker w = new Worker(ThreadDone);
        Thread t = new Thread(w.DoWork);
        t.IsBackground = true;
        ThreadPool.QueueUserWorkItem(t);
    }
    LaunchWaitingThreads();
    while (!done)
    {
        Thread.Sleep(200);
    }
}


