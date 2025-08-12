private static void Main (string [] args) {
    Thread t = new Thread (ReaderFunc);
    t.Start ();
    int index = 0;
    while (! StopWriting.WaitOne (Timeout.Infinite)) {
        ++ index;
        Console.WriteLine (index.ToString ());
    }
    t.Join ();
}


  private static void Main(string[] args)
{
    Thread t = new Thread(ReaderFunc);
    t.Start();
    int index = 0;
    do
    {
        index++;
        Console.WriteLine(Guid.NewGuid().ToString());
    } while (StopWriting.WaitOne(Timeout.Infinite) == false);
    t.Join();
}


