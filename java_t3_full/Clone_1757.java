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
    Deque < Integer > dq = new LinkedList < Integer > ();
    while (System.in.available () > 0) {
        dq.addFirst (System.in.read ());
    }
    while (dq.size () > n) {
        dq.removeLast ();
    }
    System.out.println (dq.peekFirst ().toString ());
}


