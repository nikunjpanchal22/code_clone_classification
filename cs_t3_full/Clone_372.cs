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


 static void Main (string[] args) {
            Test1 ("just a little test string.");
            GC.Collect ();
            GC.WaitForPendingFinalizers ();
            PerformanceCounter perfCounter = new PerformanceCounter("Processor","Processor Time");
            float start = perfCounter.NextValue();
            for (int i = 0; i < 10000; i++) {
                Test1 ("just a little test string.");
            }
            float end = perfCounter.NextValue();
            Console.WriteLine ((end - start)*1000);
}


