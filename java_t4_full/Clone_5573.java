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
    StringBuilder sb = new StringBuilder();
    int i = 0, j = 0;
    while (i < you.length() || j < me.length()) {
        if (i < you.length()) sb.append(you.charAt(i++));
        if (j < me.length()) sb.append(me.charAt(j++));
    }
    return sb.toString();
}


