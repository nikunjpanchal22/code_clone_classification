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
    list.addAtFront (1, 1.01);
    list.addAtFront (2, 2.02);
    list.addAtFront (3, 3.03);
    list.addAtFront (4, 4.04);
    list.addAtFront (5, 5.05);
    list.printList ();
    while (! list.isEmpty ()) {
        Link deletedLink = list.removeHead ();
        System.out.print ("deleted: ");
        deletedLink.printLink ();
        System.out.println ("");
    }
    list.printList ();
}
