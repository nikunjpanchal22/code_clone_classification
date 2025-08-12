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
    var ns3 = new List < int > ();
    for (int o = 0; o < 1000; o ++)
        ns3.Add (1);
    var s7 = Stopwatch.StartNew ();
    bool result3 = SubsetGroupings (ns3, 1000);
    s7.Stop ();
    Console.WriteLine (result3);
    Console.WriteLine (s7.Elapsed);
    Console.Read ();
}
