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
    Console.WriteLine ("Add Items:");
    SinglyLinkedList myList1 = new SinglyLinkedList ();
    myList1.insertAtStart ("Hello");
    myList1.insertAtStart ("Magical");
    myList1.insertAtStart ("World");
    myList1.printAllNodes ();
    Console.WriteLine ();
    Console.WriteLine ("Add Items:");
    SinglyLinkedList myList2 = new SinglyLinkedList ();
    myList2.insertAtEnd ("Hello");
    myList2.insertAtEnd ("Magical");
    myList2.insertAtEnd ("World");
    myList2.printAllNodes ();
    Console.ReadLine ();
}
