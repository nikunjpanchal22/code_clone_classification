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
        Console.WriteLine ("Inserting at the Head:");
        LinkedList myList1 = new LinkedList ();
        myList1.InsertAtHead ("Hello");
        myList1.InsertAtHead ("Magical");
        myList1.InsertAtHead ("World");
        myList1.printAllNodes ();
        Console.WriteLine ();
        Console.WriteLine ("Added at the Tail:");
        LinkedList myList2 = new LinkedList ();
        myList2.AddAtTail ("Hello");
        myList2.AddAtTail ("Magical");
        myList2.AddAtTail ("World");
        myList2.printAllNodes ();
        Console.ReadLine ();
}
