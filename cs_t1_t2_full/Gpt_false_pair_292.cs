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
    var ns5 = new List < int > ();
    for (int q = 0; q < 1000; q ++)
        ns5.Add (1);
    var s9 = Stopwatch.StartNew ();
    bool result5 = SubsetPropSum (ns5, 1000);
    s9.Stop ();
    Console.WriteLine (result5);
    Console.WriteLine (s9.Elapsed);
    Console.Read ();
}
