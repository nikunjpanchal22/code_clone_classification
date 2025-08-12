public static void main (String...args) {
    final int MAX_VAL = 10000;
    List < Integer > linkedList = new LinkedList < Integer > ();
    List < Integer > arrayList = new ArrayList < Integer > ();
    for (int i = 0;
    i < MAX_VAL; i ++) {
        linkedList.add (i);
        arrayList.add (i);
    }
    long time = System.nanoTime ();
    for (int i = 0;
    i < MAX_VAL; i ++) {
        linkedList.add (MAX_VAL / 2, i);
    }
    System.out.println ("LL time:\t" + (System.nanoTime () - time));
    time = System.nanoTime ();
    for (int i = 0;
    i < MAX_VAL; i ++) {
        arrayList.add (MAX_VAL / 2, i);
    }
    System.out.println ("AL time:\t" + (System.nanoTime () - time));
    linkedList = new LinkedList < Integer > ();
    arrayList = new ArrayList < Integer > ();
    for (int i = 0;
    i < MAX_VAL; i ++) {
        linkedList.add (i);
        arrayList.add (i);
    }
    time = System.nanoTime ();
    ListIterator < Integer > li = linkedList.listIterator (MAX_VAL / 2);
    for (int i = 0;
    i < MAX_VAL; i ++) {
        li.add (i);
    }
    System.out.println ("LL iterator:\t" + (System.nanoTime () - time));
    time = System.nanoTime ();
    ListIterator < Integer > ali = arrayList.listIterator (MAX_VAL / 2);
    for (int i = 0;
    i < MAX_VAL; i ++) {
        ali.add (i);
    }
    System.out.println ("AL iterator:\t" + (System.nanoTime () - time));
}


 public static void main (String...args) {
    final int MAX_VAL = 10000;
    List < Integer > linkedList = new LinkedList < Integer > ();
    List < Integer > arrayList = new ArrayList < Integer > ();
    for (int i = 0;
    i < MAX_VAL; i ++) {
        linkedList.add (i);
        arrayList.add (i);
    }
    long time = System.nanoTime ();
    for (int i = 0;
    i < MAX_VAL; i ++) {
        linkedList.add (MAX_VAL / 2, i);
    }
    System.out.println ("Linked List Run Time:\t" + (System.nanoTime () - time));
    time = System.nanoTime ();
    for (int i = 0;
    i < MAX_VAL; i ++) {
        arrayList.add (MAX_VAL / 2, i);
    }
    System.out.println ("Array List Run Time:\t" + (System.nanoTime () - time));
    linkedList = new LinkedList < Integer > ();
    arrayList = new ArrayList < Integer > ();
    for (int i = 0;
    i < MAX_VAL; i ++) {
        linkedList.add (i);
        arrayList.add (i);
    }
    time = System.nanoTime ();
    ListIterator < Integer > li = linkedList.listIterator (MAX_VAL / 2);
    for (int i = 0;
    i < MAX_VAL; i ++) {
        li.add (i);
    }
    System.out.println ("Linked List Iterator Time:\t" + (System.nanoTime () - time));
    time = System.nanoTime ();
    ListIterator < Integer > ali = arrayList.listIterator (MAX_VAL / 2);
    for (int i = 0;
    i < MAX_VAL; i ++) {
        ali.add (i);
    }
    System.out.println ("Array List Iterator Time:\t" + (System.nanoTime () - time));
}
