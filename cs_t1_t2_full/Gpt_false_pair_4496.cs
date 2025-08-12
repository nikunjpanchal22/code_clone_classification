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
    if (! LL.Contain (7))
        Console.WriteLine ("7 is not exist.");
    LL.Print ();
    LL.Add (7);
    LL.Add (8);
    LL.Add (9);
    LL.Add (9);
    if (LL.Contain (7))
        Console.WriteLine ("7 is exist.");
    LL.Print ();
    LL.Delete (7);
    LL.Delete (9);
    if (! LL.Delete (7))
        Console.WriteLine ("7 is not exist.");
    LL.Print ();
    Console.ReadLine ();
}
