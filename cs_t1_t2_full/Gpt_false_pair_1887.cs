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
    if (! LL.ContainsValue (0))
        Console.WriteLine ("0 is not included.");
    LL.PrintList ();
    LL.Insert (0);
    LL.Insert (1);
    LL.Insert (2);
    LL.Insert (2);
    if (LL.ContainsValue (0))
        Console.WriteLine ("0 is included.");
    LL.PrintList ();
    LL.DeleteValue (0);
    LL.DeleteValue (2);
    if (! LL.DeleteValue (0))
        Console.WriteLine ("0 is not included.");
    LL.PrintList ();
    Console.ReadLine ();
}
