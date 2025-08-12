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


 public static void Main (string [] args) 
{
    Stopwatch t0 = new Stopwatch ();
    int maxNumber = 20;
    long start;
    t0.Start ();
    start = Orig (maxNumber);
    Console.Write ("Original | ");
    Console.Write (maxNumber);
    Console.Write (", ");
    Console.Write (start);
    Console.WriteLine ();
    Console.Write ("Original | time elapsed = ");
    Console.Write (t0.Elapsed);
    Console.WriteLine ();
    t0.Restart ();
    start = Test (maxNumber);
    t0.Stop ();
    Console.Write ("Test | ");
    Console.Write (maxNumber);
    Console.Write (", ");
    Console.Write (start);
    Console.WriteLine ();
    Console.Write ("Test | time elapsed = ");
    Console.Write (t0.Elapsed);
    Console.WriteLine ();
    Console.ReadLine ();
}


