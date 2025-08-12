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
    LinkedList<string> alpha = new LinkedList<string>();
    for (char a = 'a'; a <= 'd'; a ++) {
        alpha.AddLast(a.ToString());
        alpha.AddLast(a.ToString());
    }
    Console.WriteLine ("Data :");
    alpha.ToList().ForEach(t => Console.WriteLine(t));   
    alpha.ForEach(delegate (string v) {
        int foundCount = 0;
        LinkedListNode<string> node = alpha.First;
        while (node != null) {
            if (node.Value == v)
                foundCount++;
            node = node.Next;
        }
        if (foundCount > 1)
            alpha.Remove(v);
    });
    Console.WriteLine ("Unique Result :");
    alpha.ToList().ForEach(t => Console.WriteLine(t));
    Console.ReadKey ();
}


