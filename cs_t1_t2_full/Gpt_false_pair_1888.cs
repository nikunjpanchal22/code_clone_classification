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
    if (! LL.ContainsElement (0))
        Console.WriteLine ("0 is not contained.");
    LL.Display ();
    LL.AddElement (0);
    LL.AddElement (1);
    LL.AddElement (2);
    LL.AddElement (2);
    if (LL.ContainsElement (0))
        Console.WriteLine ("0 is contained.");
    LL.Display ();
    LL.DeleteElement (0);
    LL.DeleteElement (2);
    if (! LL.DeleteElement (0))
        Console.WriteLine ("0 is not contained.");
    LL.Display ();
    Console.ReadLine ();
}
