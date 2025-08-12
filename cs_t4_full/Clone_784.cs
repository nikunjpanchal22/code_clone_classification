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
        var sw = new Stopwatch ();
        sw.Start ();
        toTest ();
        sw.Stop ();
        totalTime += sw.ElapsedMilliseconds;
        sw.Reset ();
    }
    Console.WriteLine ("costs {0}", totalTime / 100);
}


