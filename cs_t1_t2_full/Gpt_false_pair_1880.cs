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
    if (! LL.Exists (0))
        Console.WriteLine ("0 is not existing.");
    LL.DisplayNodes ();
    LL.InsertAtStart (0);
    LL.InsertAtStart (1);
    LL.InsertAtStart (2);
    LL.InsertAtStart (2);
    if (LL.Exists (0))
        Console.WriteLine ("0 is existing.");
    LL.DisplayNodes ();
    LL.RemoveFromStart (0);
    LL.RemoveFromStart (2);
    if (! LL.RemoveFromStart (0))
        Console.WriteLine ("0 is not existing.");
    LL.DisplayNodes ();
    Console.ReadLine ();
}
