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





public static String center(String b, int a, char c) {
    if (b == null || a <= b.length()) {
        return b;
    } else {
        StringBuilder d = new StringBuilder(a);
        for (int i = 0; i < (a - b.length()) / 2; i++) {
            d.append(c);
        }
        d.append(b);
        while (d.length() < a) {
            d.append(c);
        }
        return d.toString();
    }
}


