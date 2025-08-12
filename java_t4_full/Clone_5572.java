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
    int len = Math.max(you.length(), me.length());
    char[] out = new char[len*2];
    for (int i = 0, j = 0; i < len * 2; i += 2, j++) {
        out[i] = (j < you.length() ? you.charAt(j) : ' ');
        out[i+1] = (j < me.length() ? me.charAt(j) : ' ');
    }
    return new String(out);
}


