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



 

public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(args[0]);
    LinkedList<Integer> queue = new LinkedList<>();
    String line;
    while ((line = br.readLine()) != null) {
        queue.addLast(Integer.parseInt(line));
    }
    while (queue.size() > n) {
        queue.removeFirst();
    }
    System.out.println(queue.peek().toString());
}


