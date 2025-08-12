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
    var ns4 = new List < int > ();
    for (int p = 0; p < 1000; p ++)
        ns4.Add (1);
    var s8 = Stopwatch.StartNew ();
    bool result4 = SubsetTotalSum (ns4, 1000);
    s8.Stop ();
    Console.WriteLine (result4);
    Console.WriteLine (s8.Elapsed);
    Console.Read ();
}
