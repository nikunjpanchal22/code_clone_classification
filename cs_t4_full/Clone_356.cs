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
            System.Diagnostics.Process.GetCurrentProcess().ProcessorAffinity = (System.IntPtr)1;
            System.Diagnostics.Stopwatch timer = new System.Diagnostics.Stopwatch();
            System.TimeSpan time1;
            System.TimeSpan time2;
            timer.Start();
            for (int i = 0; i < 10000; i++) {
                Test1 ("just a little test string.");
            }
            time1 = timer.Elapsed;
            System.Diagnostics.Process.GetCurrentProcess().ProcessorAffinity = (System.IntPtr)2;
            timer.Restart();
            for (int i = 0; i < 10000; i++) {
                Test1 ("just a little test string.");
            }
            time2 = timer.Elapsed;
            Console.WriteLine (time1 + " - "+time2);
}


