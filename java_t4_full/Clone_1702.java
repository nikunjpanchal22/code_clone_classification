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
    Stack<Integer> stack = new Stack<>();
    while (System.in.available() > 0)
    {
        stack.push(System.in.readInt());
    }
    while (stack.size() > n)
    {
        stack.pop();
    }
    System.out.println(stack.peek().toString());
}


