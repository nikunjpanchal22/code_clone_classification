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
    var timer = Stopwatch.StartNew();
    new List<int>(Enumerable.Range(1, 10000)).ForEach(i => Test1(str));
    timer.Stop();
    Console.WriteLine(timer.ElapsedTicks);
}


