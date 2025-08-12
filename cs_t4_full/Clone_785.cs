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
    var totalTime = 0L;
    for (int i = 0; i < 100; i ++) {
        long start = System.DateTime.Now.Ticks;
        toTest ();
        long end = System.DateTime.Now.Ticks;
        totalTime += (end - start);
    }
    Console.WriteLine ("costs {0}", totalTime / 100);
}


