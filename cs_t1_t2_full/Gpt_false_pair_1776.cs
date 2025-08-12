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
 
   // Use the BitConverter class to check if the underlying double values are NaN
    sw = Stopwatch.StartNew();
    for (int i = 0; i < iterations; i++)
    {
        isNan = BitConverter.DoubleToInt64Bits(nan) == 0x7FF8000000000000L;
        isNan = BitConverter.DoubleToInt64Bits(notNan) != 0x7FF8000000000000L;
    }
    sw.Stop();
    Console.WriteLine("BitConverter: {0}", sw.ElapsedMilliseconds);
 
    Console.Read();
}
