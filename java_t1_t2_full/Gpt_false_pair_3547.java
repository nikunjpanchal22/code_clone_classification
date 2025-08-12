public static void main (String args []) {
    Scanner sc = new Scanner (System.in);
    ArrayList < Integer > l = new ArrayList < Integer > (10);
    for (int i = 0;
    i < 10; i ++) l.add (sc.nextInt ());
    Collections.shuffle (l);
    for (int j = 0;
    j < 10; j ++) System.out.println (l.get (j));
}


public static void main (String args []) {
    Scanner sc = new Scanner (System.in);
    ArrayList < Integer > l = new ArrayList < Integer > (10);
    for (int i = 9; i > 0; i--) l.add (sc.nextInt ());
    Collections.shuffle (l);
    for (int j = 0; j < 10; j++) System.out.println (l.get (j));
}
