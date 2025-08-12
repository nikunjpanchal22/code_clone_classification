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
 
    // Use the VBScript intrinsic IsNaN() function
    sw = Stopwatch.StartNew();
    dynamic scriptGlobal = Microsoft.JScript.ScriptRuntime.ScriptEngine("jscript");
    for (int i = 0; i < iterations; i++)
    {
        isNan = scriptGlobal.IsNaN(nan);
        isNan = scriptGlobal.IsNaN(notNan);
    }
    sw.Stop();
    Console.WriteLine("ScriptGlobal.IsNaN: {0}", sw.ElapsedMilliseconds);

    Console.Read();
}


