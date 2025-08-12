public static void Main () {
    int iterations = 500 * 1000 * 1000;
    double nan = double.NaN;
    double notNan = 42;
    Stopwatch sw = Stopwatch.StartNew ();
    bool isNan;
    for (int i = 0; i < iterations; i ++) {
        isNan = IsNaN (nan);
        isNan = IsNaN (notNan);
    }
    sw.Stop ();
    Console.WriteLine ("IsNaN: {0}", sw.ElapsedMilliseconds);
    sw = Stopwatch.StartNew ();
    for (int i = 0; i < iterations; i ++) {
        isNan = double.IsNaN (nan);
        isNan = double.IsNaN (notNan);
    }
    sw.Stop ();
    Console.WriteLine ("double.IsNaN: {0}", sw.ElapsedMilliseconds);
    Console.Read ();
}


public static void Main () {
    int iterations = 500 * 1000 * 1000;
    double nan = double.NaN;
    double notNan = 42;
    Stopwatch sw = Stopwatch.StartNew ();
    bool isNan;
    for (int i = 0; i < iterations; i ++) {
        isNan = IsNaN (nan, notNan);
    }
    sw.Stop ();
    Console.WriteLine ("IsNaN: {0}", sw.ElapsedMilliseconds);
    sw = Stopwatch.StartNew ();
    for (int i = 0; i < iterations; i ++) {
        isNan = IsNaNDouble (nan, notNan);
    }
    sw.Stop ();
    Console.WriteLine ("double.IsNaN: {0}", sw.ElapsedMilliseconds);
    Console.Read ();
}
