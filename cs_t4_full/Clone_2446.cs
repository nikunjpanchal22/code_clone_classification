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
    string testString = "just a little test string.";
    var timer1 = Stopwatch.StartNew();
    Test1(testString);
    timer1.Stop();

    GC.Collect();
    GC.WaitForPendingFinalizers();

    var timer2 = Stopwatch.StartNew();
    for (int i = 0; i < 10000; ++i)
    {
        Test1(testString);
    }
    timer2.Stop();

    Console.WriteLine(timer1.Elapsed + "\n" + timer2.Elapsed);
}


