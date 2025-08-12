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
    int maxLength = Math.max(you.length(), me.length());
    StringBuilder out = new StringBuilder();
    for(int i=0; i<maxLength; i++) {
        char c = i < you.length() ? you.charAt(i) : ' ';
        out.append(c);
        char d = i < me.length() ? me.charAt(i) : ' ';
        out.append(d);
    }
    return out.toString();
}


