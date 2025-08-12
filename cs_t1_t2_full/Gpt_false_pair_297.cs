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
    var ns2 = new List < int > ();
    for (int n = 0; n < 1000; n ++)
        ns2.Add (1);
    var s6 = Stopwatch.StartNew ();
    bool res2 = SplitSubset (ns2, 1000);
    s6.Stop ();
    Console.WriteLine (res2);
    Console.WriteLine (s6.Elapsed);
    Console.Read ();
}
