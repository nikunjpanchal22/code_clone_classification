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
    var list2 = new List <int> ();
    for (int m = 0; m < 1000; m ++)
        list2.Add (1);
    var s5 = Stopwatch.StartNew ();
    bool output2 = SubsetSumSums (list2, 1000);
    s5.Stop ();
    Console.WriteLine (output2);
    Console.WriteLine (s5.Elapsed);
    Console.Read ();
}
