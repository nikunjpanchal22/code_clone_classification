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
            QuickStack (input);
            sw.Stop ();
            Console.WriteLine ("QuickStack(): {0}ms", sw.ElapsedMilliseconds);
            sw.Restart ();
            BubbleStack (input);
            sw.Stop ();
            Console.WriteLine ("BubbleStack(): {0}ms", sw.ElapsedMilliseconds);
            sw.Restart ();
            ShellsortStack (input);
            sw.Stop ();
            Console.WriteLine ("ShellsortStack(): {0}ms", sw.ElapsedMilliseconds);
            sw.Reset ();
            Console.ReadLine ();
        }
}
