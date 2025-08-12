static void Main () {
    LinkedList < int > LL = new LinkedList < int > ();
    if (! LL.Contain (0))
        Console.WriteLine ("0 is not exist.");
    LL.Print ();
    LL.Add (0);
    LL.Add (1);
    LL.Add (2);
    LL.Add (2);
    if (LL.Contain (0))
        Console.WriteLine ("0 is exist.");
    LL.Print ();
    LL.Delete (0);
    LL.Delete (2);
    if (! LL.Delete (0))
        Console.WriteLine ("0 is not exist.");
    LL.Print ();
    Console.ReadLine ();
}


 
static void Main () {
    LinkedList < int > LL = new LinkedList < int > ();
    if (! LL.ContainsData (0))
        Console.WriteLine ("0 is not found.");
    LL.PrintNode ();
    LL.InsertHead (0);
    LL.InsertHead (1);
    LL.InsertHead (2);
    LL.InsertHead (2);
    if (LL.ContainsData (0))
        Console.WriteLine ("0 is found.");
    LL.PrintNode ();
    LL.RemoveHead (0);
    LL.RemoveHead (2);
    if (! LL.RemoveHead (0))
        Console.WriteLine ("0 is not found.");
    LL.PrintNode ();
    Console.ReadLine ();
}
