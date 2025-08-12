public static void Main (string [] args) {
    Stopwatch t0 = new Stopwatch ();
    int maxNumber = 20;
    long start;
    t0.Start ();
    start = Orig (maxNumber);
    t0.Stop ();
    Console.WriteLine ("Original | {0:d}, {1:d}", maxNumber, start);
    Console.WriteLine ("Original | time elapsed = {0}.", t0.Elapsed);
    t0.Restart ();
    start = Test (maxNumber);
    t0.Stop ();
    Console.WriteLine ("Test | {0:d}, {1:d}", maxNumber, start);
    Console.WriteLine ("Test | time elapsed = {0}.", t0.Elapsed);
    Console.ReadLine ();
}



 public static void Main(string[] args)
{
    Stopwatch t0 = new Stopwatch();
    int maxNumber = 20;
    long start;
    t0.Start();
    start = Orig(maxNumber);
    t0.Stop();
    Console.WriteLine($"Original | {maxNumber:d}, {start:d}");
    Console.WriteLine($"Original | time elapsed = {t0.Elapsed}");
    t0.Restart();
    start = Test(maxNumber);
    t0.Stop();
    Console.WriteLine($"Test | {maxNumber:d}, {start:d}");
    Console.WriteLine($"Test | time elapsed = {t0.Elapsed}");
    Console.ReadKey();
}


