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
		new Thread(new ParameterizedThreadStart(new Worker(ThreadDone).DoWork)).Start(i);
	    }
	    while(!done) Thread.Sleep(200);
}


