public static String center (String s, int size, char pad) {
    if (s == null || size <= s.length ()) return s;
    StringBuilder sb = new StringBuilder (size);
    for (int i = 0;
    i < (size - s.length ()) / 2; i ++) {
        sb.append (pad);
    }
    sb.append (s);
    while (sb.length () < size) {
        sb.append (pad);
    }
    return sb.toString ();
}


 public static String center (String s, int size, char pad) {
    if (s == null || size <= s.length ()) return s;
    int start = (size - s.length ()) / 2;
    StringBuilder sb = new StringBuilder (size);
    for (int i = 0; i < start; i++)
        sb.append (pad);
    sb.append (s);
    for (int i = 0; i < size - (start + s.length()); i++)
        sb.append (pad);
    return sb.toString ();
}


