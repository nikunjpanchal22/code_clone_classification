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




public void Run() {
	    for(int i = 0; i < 50; i++) {
		ThreadPool.QueueUserWorkItem(new WaitCallback((object state) => new Worker(ThreadDone).DoWork));
	    }
	    do {
		Thread.Sleep(200);
	    } while(!done);
}


