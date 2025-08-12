public int compare (String o1, String o2) {
    System.out.println ("Compare(" + o1 + "," + o2 + ")");
    char [] a1 = o1.toCharArray ();
    Arrays.sort (a1);
    char [] a2 = o2.toCharArray ();
    Arrays.sort (a2);
    return new String (a1).compareTo (new String (a2));
}



public int compare (String o1, String o2) {
    System.out.println ("Compare(" + o1 + "," + o2 + ")");
    char [] a1 = o1.toCharArray ();
    Arrays.sort (a1);
    char [] a2 = o2.toCharArray ();
    Arrays.sort (a2, Collections.reverseOrder());
    return new String (a1).compareTo (new String (a2));
}
