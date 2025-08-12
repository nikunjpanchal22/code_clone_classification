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
    Vector<Integer> vec = new Vector<>();
    while (System.in.available() > 0)
    {
        vec.add(System.in.readInt());
    }
    while (vec.size() > n) 
    {
        vec.remove(0);
    }
    System.out.println(vec.elementAt(0).toString());
}


