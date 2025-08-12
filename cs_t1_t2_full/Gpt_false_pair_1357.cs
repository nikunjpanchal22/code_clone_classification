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
        Console.WriteLine ("Inserting at the Start:");
        LinkedList myList1 = new LinkedList ();
        myList1.InsertAtStart ("Hello");
        myList1.InsertAtStart ("Magical");
        myList1.InsertAtStart ("World");
        myList1.printAllNodes ();
        Console.WriteLine ();
        Console.WriteLine ("Appending at the Tail:");
        LinkedList myList2 = new LinkedList ();
        myList2.AppendAtTail ("Hello");
        myList2.AppendAtTail ("Magical");
        myList2.AppendAtTail ("World");
        myList2.printAllNodes ();
        Console.ReadLine ();
}
