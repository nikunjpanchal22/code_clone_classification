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



 

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            queue.offer(in.nextInt());
        }
        while (queue.size() > n) {
            queue.poll();
        }
        System.out.println(queue.peek());
    }
}


