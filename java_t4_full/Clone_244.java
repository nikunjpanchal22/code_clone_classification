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
    int len = str.length ();
    int index = 0;
    boolean a = false;
    boolean b = false;
    boolean c = false;
    boolean d = false;
    
    if (index < len && (str.charAt(index) == '+' || str.charAt(index) == '-')) {
        index++;
    }
    
    while (index < len && Character.isDigit (str.charAt (index))) {
        index++;
        a = true;
    }
    
    if (index < len && str.charAt (index) == '.') {
        index++;
    }
    
    while (index < len && Character.isDigit (str.charAt (index))) {
        index++;
        b = true;
    }
    
    if (index < len && (str.charAt (index) == 'e' || str.charAt (index) == 'E') && (a || b)) {
        index++;
        c = true;
    }
    
    if (index < len && (str.charAt (index) == '+' || str.charAt (index) == '-') && c) {
        index++;
    }
    
    while (index < len && Character.isDigit (str.charAt (index))) {
        index++;
        d = true;
    }
    
    return index == len && (a || b) && (! c || (c && d));
}


