static void Main (string [] args) {
    List < string > alpha = new List < string > ();
    for (char a = 'a'; a <= 'd'; a ++) {
        alpha.Add (a.ToString ());
        alpha.Add (a.ToString ());
    }
    Console.WriteLine ("Data :");
    alpha.ForEach (delegate (string t) {
        Console.WriteLine (t);
    });
    alpha.ForEach (delegate (string v) {
        if (alpha.FindAll (delegate (string t) {
            return t == v;
        }).Count > 1)
            alpha.Remove (v);
    });
    Console.WriteLine ("Unique Result :");
    alpha.ForEach (delegate (string t) {
        Console.WriteLine (t);
    });
    Console.ReadKey ();
}


 static void Main (string [] args) {
    Dictionary<string, int> alpha = new Dictionary<string, int>();
    for (char a = 'a'; a <= 'd'; a ++) {
        if (alpha.ContainsKey(a.ToString()))
            alpha[a.ToString()] += 1;
        else
            alpha[a.ToString()] = 1;
    }
    Console.WriteLine ("Data :");
    alpha.Keys.ToList().ForEach(t => Console.WriteLine(t));
    Console.WriteLine ("Unique Result :");
    alpha.Where(x => x.Value == 1).Select(x => x.Key).ToList().ForEach(t => Console.WriteLine(t));
    Console.ReadKey();
}


