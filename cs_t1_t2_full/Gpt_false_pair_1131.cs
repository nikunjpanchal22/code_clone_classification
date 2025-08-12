static int Main (string [] args) {
    var num1 = 10;
    var num2 = 100;
    var maxValue = 0;
    var LoopCount = 1000000000;
    double controlTotalSeconds;
    {
        var stopwatch = new Stopwatch ();
        stopwatch.Start ();
        for (var i = 0; i < LoopCount; i ++) {
        }
        stopwatch.Stop ();
        controlTotalSeconds = stopwatch.Elapsed.TotalSeconds;
        Console.WriteLine ("Control - Empty Loop - " + controlTotalSeconds + " seconds");
    } Console.WriteLine ();
    {
        var stopwatch = new Stopwatch ();
        stopwatch.Start ();
        for (int i = 0; i < LoopCount; i ++) {
            maxValue = Math.Max (num1, num2);
        }
        stopwatch.Stop ();
        Console.WriteLine ("Math.Max() - " + stopwatch.Elapsed.TotalSeconds + " seconds");
        Console.WriteLine ("Relative: " + (stopwatch.Elapsed.TotalSeconds - controlTotalSeconds) + " seconds");
    } Console.WriteLine ();
    {
        var stopwatch = new Stopwatch ();
        stopwatch.Start ();
        for (int i = 0; i < LoopCount; i ++) {
            maxValue = num1 > num2 ? num1 : num2;
        }
        stopwatch.Stop ();
        Console.WriteLine ("Inline Max: " + stopwatch.Elapsed.TotalSeconds + " seconds");
        Console.WriteLine ("Relative: " + (stopwatch.Elapsed.TotalSeconds - controlTotalSeconds) + " seconds");
    } Console.ReadLine ();
    return maxValue;
}


 static int Main (string [] args)
{
    var num1 = 10;
    var num2 = 100;
    var maxValue = 0;
    var LoopCount = 1000000000;
    double controlTotalSeconds;
    {
        var stopwatch = new Stopwatch ();
        stopwatch.Start ();
        for (var i = 0; i < LoopCount; i ++) {
        }
        stopwatch.Stop ();
        controlTotalSeconds = stopwatch.Elapsed.TotalSeconds;
        Console.WriteLine ("Control - Empty Loop - " + controlTotalSeconds + " seconds");
    } Console.WriteLine ();
    {
        var stopwatch = new Stopwatch ();
        stopwatch.Start ();
        for (int i = 0; i < LoopCount; i ++) {
            int mask = num2 - num1 >> 31;
            maxValue = (num1 & mask) | (num2 & ~mask);  
        }
        stopwatch.Stop ();
        Console.WriteLine ("Mask Operators: " + stopwatch.Elapsed.TotalSeconds + " seconds");
        Console.WriteLine ("Relative: " + (stopwatch.Elapsed.TotalSeconds - controlTotalSeconds) + " seconds");
    } Console.WriteLine ();
    {
        var stopwatch = new Stopwatch ();
        stopwatch.Start ();
        for (int i = 0; i < LoopCount; i ++) {
            maxValue = num2 + ((num1 - num2) & (num1 - num2) >> 31);
        }
        stopwatch.Stop ();
        Console.WriteLine ("Shift Operators: " + stopwatch.Elapsed.TotalSeconds + " seconds");
        Console.WriteLine ("Relative: " + (stopwatch.Elapsed.TotalSeconds - controlTotalSeconds) + " seconds");
    } Console.ReadLine ();
    return maxValue;
}
