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


  private static void Main (string [] args) 
{
    Thread t = new Thread (ReaderFunc);
    t.Start ();
    int index;
    do
    {
        index++;
        Console.WriteLine(index.ToString());
    } while(StopWriting.WaitOne(Timeout.Infinite) == false);
    t.Join();
}


