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
    if (! LL.HasValue (0))
        Console.WriteLine ("0 is not existent.");
    LL.List ();
    LL.InsAtHead (0);
    LL.InsAtHead (1);
    LL.InsAtHead (2);
    LL.InsAtHead (2);
    if (LL.HasValue (0))
        Console.WriteLine ("0 is existent.");
    LL.List ();
    LL.DelAtHead (0);
    LL.DelAtHead (2);
    if (! LL.DelAtHead (0))
        Console.WriteLine ("0 is not existent.");
    LL.List ();
    Console.ReadLine ();
}
