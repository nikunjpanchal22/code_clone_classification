public static int solution (int X, int [] A) {
    Set < Integer > values = new HashSet < Integer > ();
    for (int i = 0;
    i < A.length; i ++) {
        if (values.add (A [i])) X --;
        if (X == 0) return i;
    }
    return - 1;
}



 

public static int solution (int X, int [] A) {
    Set < Integer > values = new CopyOnWriteArraySet < Integer > ();
    int i = 0;
    for (int value: A) {
      if (values.add(value)) X --;
      if (X==0) return i;
      i++;
    }
    return -1;
}


