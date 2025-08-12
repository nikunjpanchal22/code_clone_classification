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
        Console.WriteLine ("Stacking at the Start:");
        LinkedList myList1 = new LinkedList ();
        myList1.StackAtStart ("Hello");
        myList1.StackAtStart ("Magical");
        myList1.StackAtStart ("World");
        myList1.printAllNodes ();
        Console.WriteLine ();
        Console.WriteLine ("Pushing at Last:");
        LinkedList myList2 = new LinkedList ();
        myList2.PushAtLast ("Hello");
        myList2.PushAtLast ("Magical");
        myList2.PushAtLast ("World");
        myList2.printAllNodes ();
        Console.ReadLine ();
}
