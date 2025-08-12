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


 static void Main(string[] args) 
{ 
    List<string> alpha = new List<string>(); 
    for (char a = 'a'; a <= 'd'; a++) 
    { 
        alpha.Add(a.ToString()); 
        alpha.Add(a.ToString()); 
    } 
    Console.WriteLine("Data :"); 
    List<string> results = new List<string>(alpha.Distinct()); 
    foreach(var v in results) 
    { 
        Console.WriteLine(v); 
    } 
    Console.WriteLine("Unique Result :"); 
    Console.WriteLine(string.Join(Environment.NewLine, results.ToArray())); 
    Console.ReadKey(); 
} 


