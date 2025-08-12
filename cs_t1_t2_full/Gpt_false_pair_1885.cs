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
    if (! LL.CheckExists (0))
        Console.WriteLine ("0 is not exist.");
    LL.ShowNode ();
    LL.InsertNode (0);
    LL.InsertNode (1);
    LL.InsertNode (2);
    LL.InsertNode (2);
    if (LL.CheckExists (0))
        Console.WriteLine ("0 is exist.");
    LL.ShowNode ();
    LL.RemoveNode (0);
    LL.RemoveNode (2);
    if (! LL.RemoveNode (0))
        Console.WriteLine ("0 is not exist.");
    LL.ShowNode ();
    Console.ReadLine ();
}
