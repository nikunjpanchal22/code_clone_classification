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
        long startTime = DateTime.Now.Ticks;
        var response = toTest();
        long endTime = DateTime.Now.Ticks;
        Console.WriteLine ("costs {0}", (endTime - startTime)/10000);
    }
}


