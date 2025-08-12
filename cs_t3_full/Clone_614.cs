public void doWork () {
    int h = 0;
    do
        {
            Thread.Sleep (3000);
            h.Dump ();
            h ++;
        } while (true);
}


public void doWork() {
    int h = 0;
    bool keepRunning = true;
    while(keepRunning) {
        Thread.Sleep(3000);
        h.Dump();
        h++;
        if(h == 10) {
            keepRunning = false;
        }
    }
}


