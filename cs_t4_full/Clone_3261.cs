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



public async void Run() {
	    for(int i = 0; i < 50; i++) {
		await Task.Factory.StartNew(() => new Worker(ThreadDone).DoWork);
	    }
	    while(!done) await Task.Delay(200);
}


