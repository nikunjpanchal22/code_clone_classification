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
	  ArrayList<Integer> list = new ArrayList<>();
	  while (System.in.available() > 0)
	  {
	      list.add(System.in.readInt());
	  }
	  Collections.sort(list);
	  while (list.size() > n)
	  {
	      list.remove(0);
	  }
	  System.out.println(list.get(0).toString());
}


