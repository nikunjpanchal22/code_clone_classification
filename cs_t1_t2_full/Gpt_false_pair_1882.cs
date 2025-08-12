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
    if (! LL.ContainsNode (0))
        Console.WriteLine ("0 is not present.");
    LL.PrintLinkedList ();
    LL.InsertAtHead (0);
    LL.InsertAtHead (1);
    LL.InsertAtHead (2);
    LL.InsertAtHead (2);
    if (LL.ContainsNode (0))
        Console.WriteLine ("0 is present.");
    LL.PrintLinkedList ();
    LL.RemoveAtHead (0);
    LL.RemoveAtHead (2);
    if (! LL.RemoveAtHead (0))
        Console.WriteLine ("0 is not present.");
    LL.PrintLinkedList ();
    Console.ReadLine ();
}
