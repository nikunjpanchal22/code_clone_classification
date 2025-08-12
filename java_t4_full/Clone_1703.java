public static void main (String [] args) {
    Integer n = Integer.parseInt (args [0]);
    Queue < Integer > q = new Queue < Integer > ();
    while (! StdIn.isEmpty ()) {
        q.enqueue (StdIn.readInt ());
    }
    while (q.size () > n) {
        q.dequeue ();
    }
    StdOut.println (q.peek ().toString ());
}


  public static void main (String [] args) {
    Integer n = Integer.parseInt (args [0]);
    ArrayDeque<Integer> ad = new ArrayDeque<>();
    while(System.in.available() > 0) {
        ad.addFirst(System.in.readInt());
    }

    while(ad.size() > n) {
        ad.removeLast();
    }
    System.out.println(ad.peekFirst().toString());
}


