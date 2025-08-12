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
    TreeSet<Integer> ts = new TreeSet<>();
    while (System.in.available() > 0)
    {
        ts.add(System.in.readInt());
    }
    while (ts.size() > n)
    {
        ts.pollFirst();
    }
    System.out.println(ts.first().toString());
}


