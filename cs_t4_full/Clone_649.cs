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
    for (int h = 0; true;) {
        Thread.Sleep(3000);
        h.Dump();
        h++;
    }
}


