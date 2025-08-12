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
	    List<Task> tasks = new List<Task>();
	    for(int i = 0; i < 50; i++) {
		tasks.Add(new Worker(ThreadDone).DoWorkAsync());
	    }
	    while(tasks.All(task => !task.IsCompleted)) await Task.Delay(200);
}


