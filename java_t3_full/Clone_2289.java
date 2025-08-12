public static String center (String s, int size, char pad) {
    if (s == null || size <= s.length ()) return s;
    StringBuilder sb = new StringBuilder (size);
    for (int i = 0;
    i < (size - s.length ()) / 2; i ++) {
        sb.append (pad);
    }
    sb.append (s);
    while (sb.length () < size) {
        sb.append (pad);
    }
    return sb.toString ();
}



public static String center(String str, int len, char padChar) {
    if (str == null || len <= str.length()) {
        return str;
    }
    
    int padding = (len - str.length()) / 2;
  
    StringBuilder result = new StringBuilder(len);
    result.append(String.valueOf(padChar).repeat(padding)).append(str);
    
    while (result.length() < len) {
        result.append(padChar);
    }
    return result.toString();
}


