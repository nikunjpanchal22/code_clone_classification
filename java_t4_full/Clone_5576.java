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




public static String interleave(String you, String me) {
    char [] out = new char [you.length() + me.length()];
    int index = 0;
    for (int i = 0; i < you.length() || i < me.length(); i++) {
        if (i < you.length()) out[index++] = you.charAt(i);
        if (i < me.length()) out[index++] = me.charAt(i);
    }
    return new String(out);
}


