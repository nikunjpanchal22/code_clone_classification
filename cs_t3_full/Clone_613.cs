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
    do {
        try {
            Thread.Sleep(3000);
        } catch (ThreadInterruptedException e) {
            Console.WriteLine("Interrupted Exception");
        } finally {
            h.Dump();
            h++;
        }
    } while(true);
}


