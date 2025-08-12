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
    int length = Math.max(you.length(), me.length());
    StringBuilder result = new StringBuilder(length * 2);
    for (int i = 0; i < length; i++) {
        if (you.length() > i) result.append(you.charAt(i));
        if (me.length() > i) result.append(me.charAt(i));
    }
    return result.toString();
}


