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
    var times = new List<long>();
    for (int i = 0; i < 100; i ++) {
        var sw = Stopwatch.StartNew ();
        toTest ();
        sw.Stop ();
        times.Add(sw.ElapsedMilliseconds);
        sw.Reset ();
    }
    Console.WriteLine("avg costs: {0}, min costs {1}, max costs {2}", times.Average(), times.Min(), times.Max());
}


