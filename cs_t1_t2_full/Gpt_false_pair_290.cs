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
    var array1 = new List < int > ();
    for (int i = 0; i < 1000; i ++)
        array1.Add (1);
    var s2 = Stopwatch.StartNew ();
    bool answer = SubsetMultiples (array1, 1000);
    s2.Stop ();
    Console.WriteLine (answer);
    Console.WriteLine (s2.Elapsed);
    Console.Read ();
}
