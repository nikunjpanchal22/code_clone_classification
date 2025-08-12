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
    LinkedList<Integer> list = new LinkedList<>();
    while (System.in.available () > 0) {
        list.add(System.in.readInt());
    }
    while (list.size() > n) {
        list.removeFirst();
    }
    System.out.println(list.getFirst().toString());
}


