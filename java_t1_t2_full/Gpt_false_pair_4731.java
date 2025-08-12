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
    list.append (1, 1.01);
    list.append (2, 2.02);
    list.append (3, 3.03);
    list.append (4, 4.04);
    list.append (5, 5.05);
    list.printList ();
    while (! list.isEmpty ()) {
        Link extractedLink = list.extract ();
        System.out.print ("extracted: ");
        extractedLink.printLink ();
        System.out.println ("");
    }
    list.printList ();
}
