public static void main (String [] args) {
    LinkList list = new LinkList ();
    list.insert (1, 1.01);
    list.insert (2, 2.02);
    list.insert (3, 3.03);
    list.insert (4, 4.04);
    list.insert (5, 5.05);
    list.printList ();
    while (! list.isEmpty ()) {
        Link deletedLink = list.delete ();
        System.out.print ("deleted: ");
        deletedLink.printLink ();
        System.out.println ("");
    }
    list.printList ();
}


  public static void main (String [] args) {
    LinkList list = new LinkList ();
    list.addAtIndex (1, 1.01, 0);
    list.addAtIndex (2, 2.02, 1);
    list.addAtIndex (3, 3.03, 2);
    list.addAtIndex (4, 4.04, 3);
    list.addAtIndex (5, 5.05, 4);
    list.printList ();
    while (! list.isEmpty ()) {
        Link deletedLink = list.removeAtIndex (0);
        System.out.print ("deleted: ");
        deletedLink.printLink ();
        System.out.println ("");
    }
    list.printList ();
}


