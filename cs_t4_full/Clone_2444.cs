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
    string testStr = "just a little test string.";
    Test1(testStr);
    GC.Collect();
    GC.WaitForPendingFinalizers();
    var sw = new Stopwatch();
    sw.Start();
    int count = 0;
    do
    {
        Test1(testStr);
        count++;
    }while(count < 10000);
    sw.Stop();
    Console.WriteLine($"Elapsed = {sw.Elapsed}");
}


