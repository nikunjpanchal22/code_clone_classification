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
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextInt()){
            queue.offer(scanner.nextInt());
        }
        queue.stream().skip(queue.size()-n).findFirst().ifPresent(System.out::println);
    }
}


