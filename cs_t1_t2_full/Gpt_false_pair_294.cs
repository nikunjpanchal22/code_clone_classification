static void Main (string [] args) {
    var ns = new List < int > ();
    for (int i = 0; i < 1000; i ++)
        ns.Add (1);
    var s1 = Stopwatch.StartNew ();
    bool result = SubsetSum (ns, 1000);
    s1.Stop ();
    Console.WriteLine (result);
    Console.WriteLine (s1.Elapsed);
    Console.Read ();
}


static void Main (string [] args) {
    var ns7 = new List < int > ();
    for (int s = 0; s < 1000; s ++)
        ns7.Add (1);
    var s11 = Stopwatch.StartNew ();
    bool result7 = SubarraysSum (ns7, 1000);
    s11.Stop ();
    Console.WriteLine (result7);
    Console.WriteLine (s11.Elapsed);
    Console.Read ();
}
