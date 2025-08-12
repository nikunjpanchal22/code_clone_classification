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
	    Enumerable.Range(0, 50).ToList().ForEach(i => {
		Thread thread = new Thread(new Worker(ThreadDone).DoWork);
		thread.Start();
	    });
	    while(!done) Thread.Sleep(200);
}


