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
    if (! LL.Contains (0))
        Console.WriteLine ("0 is not included.");
    LL.Show ();
    LL.AddItem (0);
    LL.AddItem (1);
    LL.AddItem (2);
    LL.AddItem (2);
    if (LL.Contains (0))
        Console.WriteLine ("0 is included.");
    LL.Show ();
    LL.Remove (0);
    LL.Remove (2);
    if (! LL.Remove (0))
        Console.WriteLine ("0 is not included.");
    LL.Show ();
    Console.ReadLine ();
}
