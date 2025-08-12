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
    var ns = new int[1000];
    for (int i = 0; i < 1000; i ++)
        ns[i] = 1;
    var s1 = Stopwatch.StartNew ();
    bool result = SubsetSum (ns.ToList(), 1000);
    s1.Stop ();
    Console.WriteLine (result);
    Console.WriteLine (s1.Elapsed);
    Console.Read ();
}


