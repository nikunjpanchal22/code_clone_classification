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
    String output = "";
    int j = 0;
    for (int i = 0; i < you.length() || j < me.length(); i++, j++) {
        output += (i < you.length() ? you.charAt(i) : "") + (j < me.length() ? me.charAt(j) : "");
    }
    return output;
}


