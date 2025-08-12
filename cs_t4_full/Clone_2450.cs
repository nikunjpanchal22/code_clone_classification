static void Main (string [] args) {
    Test1 ("just a little test string.");
    GC.Collect ();
    GC.WaitForPendingFinalizers ();
    Stopwatch timer = new Stopwatch ();
    timer.Start ();
    for (int i = 0; i < 10000; i ++) {
        Test1 ("just a little test string.");
    }
    timer.Stop ();
    Console.WriteLine (timer.Elapsed);
}



static void Main(string[] args)
{
    string str = "just a little test string.";
    Test1(str);
    GC.Collect();
    GC.WaitForPendingFinalizers();
    Stopwatch timer = Stopwatch.StartNew();
    Enumerable.Range(0, 10000).ToList().ForEach(x => Test1(str));
    timer.Stop();
    Console.WriteLine(timer.Elapsed);
}


