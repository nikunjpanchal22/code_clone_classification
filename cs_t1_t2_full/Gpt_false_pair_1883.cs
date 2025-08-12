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
    if (! LL.ContainValue (0))
        Console.WriteLine ("0 is not located.");
    LL.PrintNodes ();
    LL.InsertAtFront (0);
    LL.InsertAtFront (1);
    LL.InsertAtFront (2);
    LL.InsertAtFront (2);
    if (LL.ContainValue (0))
        Console.WriteLine ("0 is located.");
    LL.PrintNodes ();
    LL.DeleteAtFront (0);
    LL.DeleteAtFront (2);
    if (! LL.DeleteAtFront (0))
        Console.WriteLine ("0 is not located.");
    LL.PrintNodes ();
    Console.ReadLine ();
}
