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
    int i, len = Math.max(you.length(), me.length());
    for(i = 0; i < len; i++) {
        sb.append(i < you.length() ? you.charAt(i) : "")
          .append(i < me.length() ? me.charAt(i) : "");
    }
    return sb.toString();
}


