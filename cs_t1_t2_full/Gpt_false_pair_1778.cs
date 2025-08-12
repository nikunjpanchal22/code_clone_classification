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


 public static void Main()
{
    int iterations = 500 * 1000 * 1000;
    double nan = Double.NaN;
    double notNan = 42;
    Stopwatch sw = Stopwatch.StartNew();

    // Use the static IsNaN() method
    bool isNan;
    for (int i = 0; i < iterations; i++)
    {
        isNan = IsNaN(nan);
        isNan = IsNaN(notNan);
    }
    sw.Stop();
    Console.WriteLine("IsNaN: {0}", sw.ElapsedMilliseconds);
 
   // Use the IsNaN() method from the System.Decimal library to check for NaN
    sw = Stopwatch.StartNew();
    for (int i = 0; i < iterations; i++)
    {
        isNan = Decimal.IsNaN(nan);
        isNan = Decimal.IsNaN(notNan);
    }
    sw.Stop();
    Console.WriteLine("Decimal.IsNaN: {0}", sw.ElapsedMilliseconds);
 
    Console.Read();
}
