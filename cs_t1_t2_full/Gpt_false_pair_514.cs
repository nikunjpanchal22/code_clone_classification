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



  static void Main (string [] args) {
            Test1 ("just a little test string.");
            GC.Collect ();
            GC.WaitForPendingFinalizers ();
            System.Diagnostics.Stopwatch timer = new System.Diagnostics.Stopwatch ();
            timer.Start ();
            for (int i = 0; i < 10000; i ++) {
                Test1 ("just a little test string.");
            }
            timer.Stop ();
            Console.WriteLine (timer.ElapsedMilliseconds);
}
