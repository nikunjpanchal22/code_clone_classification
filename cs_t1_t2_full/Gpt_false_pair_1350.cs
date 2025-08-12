static void Main (string [] args) {
    Console.WriteLine ("Add First:");
    LinkedList myList1 = new LinkedList ();
    myList1.AddFirst ("Hello");
    myList1.AddFirst ("Magical");
    myList1.AddFirst ("World");
    myList1.printAllNodes ();
    Console.WriteLine ();
    Console.WriteLine ("Add Last:");
    LinkedList myList2 = new LinkedList ();
    myList2.AddLast ("Hello");
    myList2.AddLast ("Magical");
    myList2.AddLast ("World");
    myList2.printAllNodes ();
    Console.ReadLine ();
}


 static void Main (string [] args) {
        Console.WriteLine ("Prepending at the Start:");
        LinkedList myList1 = new LinkedList ();
        myList1.PrependAtStart ("Hello");
        myList1.PrependAtStart ("Magical");
        myList1.PrependAtStart ("World");
        myList1.printAllNodes ();
        Console.WriteLine ();
        Console.WriteLine ("Appending at the End:");
        LinkedList myList2 = new LinkedList ();
        myList2.AppendAtEnd ("Hello");
        myList2.AppendAtEnd ("Magical");
        myList2.AppendAtEnd ("World");
        myList2.printAllNodes ();
        Console.ReadLine ();
}
