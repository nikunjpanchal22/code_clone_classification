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
    if (! LL.Contain (3))
        Console.WriteLine ("3 is not exist.");
    LL.Print ();
    LL.Add (3);
    LL.Add (4);
    LL.Add (5);
    LL.Add (5);
    if (LL.Contain (3))
        Console.WriteLine ("3 is exist.");
    LL.Print ();
    LL.Delete (3);
    LL.Delete (5);
    if (! LL.Delete (3))
        Console.WriteLine ("3 is not exist.");
    LL.Print ();
    Console.ReadLine ();
}
