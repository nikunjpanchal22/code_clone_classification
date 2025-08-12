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


public static String interleave (String us, String them) {
    char [] c = us.toCharArray ();
    char [] d = them.toCharArray ();
    StringBuilder result = new StringBuilder ();
    int maxLength = Math.max (c.length, d.length);
    for (int i = 0;
    i < maxLength; i ++) {
        if (i < c.length) result.append (c [i]);
        if (i < d.length) result.append (d [i]);
    }
    return result.toString ();
}
