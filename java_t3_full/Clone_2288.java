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





public static String center(String s, int width, char fill) {
    if (s == null || width <= s.length()) {
        return s;
    }
    final StringBuilder buf = new StringBuilder(width);
    for (int i = 0; i < (width - s.length()) / 2; i++) {
        buf.append(fill);
    }
    buf.append(s);
    while (buf.length() < width) {
        buf.append(fill);
    }
    return buf.toString();
}


