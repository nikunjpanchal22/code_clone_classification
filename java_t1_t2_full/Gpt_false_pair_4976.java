public int solution (int X, int [] A) {
    HashSet < Integer > hset = new HashSet < Integer > ();
    for (int i = 0;
    i < A.length; i ++) {
        if (A [i] <= X) hset.add (A [i]);
        if (hset.size () == X) return i;
    }
    return - 1;
}


public int solution (int X, int [] A) {
    Set < Integer > sset = new HashSet < Integer > ();
    for (int i = 0;
    i < A.length; i ++) {
        if (A [i] <= X) sset.add (A [i]);
        if (sset.size () == X) return i;
    }
    return - 1;
 }

//Type 4 code clone variant:
public int solution (int X, int [] A) {
    TreeSet < Integer > tset = new TreeSet < Integer > ();
    for (int i = 0;
    i < A.length; i ++) {
        if (A [i] <= X) tset.add (A [i]);
        if (tset.size () == X) return i;
    }
    return - 1;
}
