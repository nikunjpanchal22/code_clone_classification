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
    list.push (1, 1.01);
    list.push (2, 2.02);
    list.push (3, 3.03);
    list.push (4, 4.04);
    list.push (5, 5.05);
    list.printList ();
    while (! list.isEmpty ()) {
        Link deletedLink = list.pop ();
        System.out.print ("deleted: ");
        deletedLink.printLink ();
        System.out.println ("");
    }
    list.printList ();
}
