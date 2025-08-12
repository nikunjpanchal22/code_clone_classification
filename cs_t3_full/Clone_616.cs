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
    while(h <= 10) {
        Thread.Sleep(3000);
        h.Dump();
        h++;
    }
}


