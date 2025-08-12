public static String interleave (String you, String me) {
    char [] a = you.toCharArray ();
    char [] b = me.toCharArray ();
    StringBuilder out = new StringBuilder ();
    int maxLength = Math.max (a.length, b.length);
    for (int i = 0;
    i < maxLength; i ++) {
        if (i < a.length) out.append (a [i]);
        if (i < b.length) out.append (b [i]);
    }
    return out.toString ();
}


public static String interleave (String a, String b) {
    char [] x = a.toCharArray ();
    char [] y = b.toCharArray ();
    StringBuilder out = new StringBuilder ();
    for (int i = 0, maxLength = Math.max (x.length, y.length); i < maxLength; i++) {
        if (i < x.length) out.append (x [i]);
        if (i < y.length) out.append (y [i]);
    }
    return out.toString ();
}
