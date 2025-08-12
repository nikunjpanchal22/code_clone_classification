public void doWork () {
    int h = 0;
    do
        {
            Thread.Sleep (3000);
            h.Dump ();
            h ++;
        } while (true);
}


public void doWork()
{
    int h = 0;
    do
    {
        Thread.Sleep(3000);
        Console.WriteLine(h);
        h++;
    } while (true);
}
