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
        var watch = new Stopwatch ();
        watch.Start ();
        var response = toTest();
        watch.Stop ();
        Console.WriteLine ("costs {0}", watch.ElapsedMilliseconds);
        watch.Reset ();
    }
}


