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
        var sw = new System.Diagnostics.Stopwatch ();
        sw.Start ();
        var response = toTest();
        sw.Stop ();
        Console.WriteLine ("costs {0}",sw.ElapsedMilliseconds);
        sw.Reset ();
    }
}


