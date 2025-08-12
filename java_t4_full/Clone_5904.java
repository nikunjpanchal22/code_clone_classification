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
        List<Integer> list= new ArrayList();
        Scanner s = new Scanner(System.in);
        while(s.hasNext()){
            list.add(s.nextInt());
        }
        System.out.println(list.get(list.size()-n));
    }
}


