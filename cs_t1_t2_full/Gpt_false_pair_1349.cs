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
        Console.WriteLine ("Insert at Front:");
        LinkedList myList1 = new LinkedList ();
        myList1.InsertAtFront ("Hello");
        myList1.InsertAtFront ("Magical");
        myList1.InsertAtFront ("World");
        myList1.printAllNodes ();
        Console.WriteLine ();
        Console.WriteLine ("Adding at the End:");
        LinkedList myList2 = new LinkedList ();
        myList2.AddAtEnd ("Hello");
        myList2.AddAtEnd ("Magical");
        myList2.AddAtEnd ("World");
        myList2.printAllNodes ();
        Console.ReadLine ();
}
