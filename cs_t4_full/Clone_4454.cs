private static void Test (Action toTest) {
    for (int i = 0; i < 100; i ++) {
        var sw = Stopwatch.StartNew ();
        toTest ();
        sw.Stop ();
        Console.WriteLine ("costs {0}", sw.ElapsedMilliseconds);
        sw.Reset ();
    }
}


  private static void Test (Func <object> toTest) {
    for (int i = 0; i < 100; i ++) {
        long startTime = System.Diagnostics.Stopwatch.GetTimestamp ();
        var response = toTest();
        long endTime = System.Diagnostics.Stopwatch.GetTimestamp ();
        Console.WriteLine ("costs {0}", (endTime - startTime)/10000);
    }
}


