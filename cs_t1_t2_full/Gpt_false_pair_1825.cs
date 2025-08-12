static void Main (string [] args) {
    Stopwatch sw = new Stopwatch ();
    double [] input = Enumerable.Range (0, 10000000).Select (i => (double) i).ToArray ();
    while (true) {
        sw.Start ();
        LinqStack (input);
        sw.Stop ();
        Console.WriteLine ("LinqStack(): {0}ms", sw.ElapsedMilliseconds);
        sw.Restart ();
        SimpleStack (input);
        sw.Stop ();
        Console.WriteLine ("SimpleStack(): {0}ms", sw.ElapsedMilliseconds);
        sw.Restart ();
        OriginalStack (input);
        sw.Stop ();
        Console.WriteLine ("OriginalStack(): {0}ms", sw.ElapsedMilliseconds);
        sw.Reset ();
        Console.ReadLine ();
    }
}


    static void Main (string [] args) {
        Stopwatch sw = new Stopwatch ();
        double [] input = Enumerable.Range (0, 10000000).Select (i => (double) i).ToArray ();
        while (true) {
            sw.Start ();
            InsertionStack (input);
            sw.Stop ();
            Console.WriteLine ("InsertionStack(): {0}ms", sw.ElapsedMilliseconds);
            sw.Restart ();
            HeapsortStack (input);
            sw.Stop ();
            Console.WriteLine ("HeapsortStack(): {0}ms", sw.ElapsedMilliseconds);
            sw.Restart ();
            MergeStack (input);
            sw.Stop ();
            Console.WriteLine ("MergeStack(): {0}ms", sw.ElapsedMilliseconds);
            sw.Reset ();
            Console.ReadLine ();
        }
}
