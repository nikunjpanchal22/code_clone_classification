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
        using (var sw = Stopwatch.StartNew ()) {
            toTest ();
            totalTime += sw.ElapsedMilliseconds;
        }
    }
    Console.WriteLine ("costs {0}", totalTime / 100);
}


