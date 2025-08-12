public static boolean isNumber (String str) {
    int i = 0, len = str.length ();
    boolean a = false, b = false, c = false, d = false;
    if (i < len && (str.charAt (i) == '+' || str.charAt (i) == '-')) i ++;
    while (i < len && isDigit (str.charAt (i))) {
        i ++;
        a = true;
    }
    if (i < len && (str.charAt (i) == '.')) i ++;
    while (i < len && isDigit (str.charAt (i))) {
        i ++;
        b = true;
    }
    if (i < len && (str.charAt (i) == 'e' || str.charAt (i) == 'E') && (a || b)) {
        i ++;
        c = true;
    }
    if (i < len && (str.charAt (i) == '+' || str.charAt (i) == '-') && c) i ++;
    while (i < len && isDigit (str.charAt (i))) {
        i ++;
        d = true;
    }
    return i == len && (a || b) && (! c || (c && d));
}


 public static boolean isNumber (String str) { 
    int i = 0; 
    boolean a = false , b = false, c = false, d = false; 
    for (; i < str.length () && (str.charAt (i) == '+' || str.charAt (i) == '-'); i ++); 
    for (; i < str.length () && Character.isDigit (str.charAt (i)); i ++, a = true); 
    if (i < str.length () && str.charAt (i) == '.') { 
        i ++; 
        for (; i < str.length () && Character.isDigit (str.charAt (i)); i ++, b = true); 
    } 
    if (i < str.length () && (str.charAt (i) == 'e' || str.charAt (i) == 'E') && (a || b)) { 
        i ++; 
        c = true; 
        if (i < str.length () && (str.charAt (i) == '+' || str.charAt (i) == '-')) i ++; 
        for (; i < str.length () && Character.isDigit (str.charAt (i)); i ++, d = true); 
    } 
    return i == str.length () && (a || b) && (!c || (c && d)); 
} 


