private static void Test (Action toTest) {
    for (int i = 0; i < 100; i ++) {
        var sw = Stopwatch.StartNew ();
        toTest ();
        sw.Stop ();
        Console.WriteLine ("costs {0}", sw.ElapsedMilliseconds);
        sw.Reset ();
    }
}


 private static void Test (Action toTest) {
    var minTime = long.MaxValue;
    var maxTime = long.MinValue;
    for (int i = 0; i < 100; i ++) {
        long start = System.DateTime.Now.Ticks;
        toTest ();
        long end = System.DateTime.Now.Ticks;
        minTime = Math.Min (minTime, end - start);
        maxTime = Math.Max (maxTime, end - start);
    }
    Console.WriteLine ("min costs {0}, max costs {1}", minTime, maxTime);  
}


