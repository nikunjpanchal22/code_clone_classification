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
    PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
    while (System.in.available () > 0) {
        pq.offer(System.in.readInt());
    }
    while(pq.size() > n) {
        pq.poll();
    }
    System.out.println(pq.peek().toString());
}


