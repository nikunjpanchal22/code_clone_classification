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



public static String interleave(String you, String me){
     int i = 0, j = 0;
     String interleaved= "";
     while (i<you.length() && j<me.length())
        interleaved+= you.charAt(i++)+""+ me.charAt(j++);
     while (i<you.length())
        interleaved+= you.charAt(i++);
     while (j<me.length())
        interleaved += me.charAt(j++);
     return interleaved;
}


