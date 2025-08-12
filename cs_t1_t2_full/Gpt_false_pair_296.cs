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
    var ns6 = new List < int > ();
    for (int r = 0; r < 1000; r ++)
        ns6.Add (1);
    var s10 = Stopwatch.StartNew ();
    bool result6 = SubsetPartialSum (ns6, 1000);
    s10.Stop ();
    Console.WriteLine (result6);
    Console.WriteLine (s10.Elapsed);
    Console.Read ();
}
