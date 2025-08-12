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
                isNan = Double.IsNaN(nan);
                isNan = Double.IsNaN(notNan);
            }
            sw.Stop();
            Console.WriteLine("Double.IsNaN: {0}", sw.ElapsedMilliseconds);
        
        // Use the EqualsTo() function to check for NaN
            sw = Stopwatch.StartNew();
            for (int i = 0; i < iterations; i++)
            {
                isNan = EqualsTo(nan, Double.NaN);
                isNan = EqualsTo(notNan, Double.NaN);
            }
            sw.Stop();
            Console.WriteLine("EqualsTo: {0}", sw.ElapsedMilliseconds);
        
            Console.Read();
        }

        static bool EqualsTo(double value1, double value2)
        {
            return value1 == value2 || Double.IsNaN(value1) && Double.IsNaN(value2);
}


