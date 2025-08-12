public CharSequence filter (CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
    int dotPos = - 1;
    int len = dest.length ();
    for (int i = 0;
    i < len; i ++) {
        char c = dest.charAt (i);
        if (c == '.' || c == ',') {
            dotPos = i;
            break;
        }
    }
    if (dotPos >= 0) {
        if (source.equals (".") || source.equals (",")) {
            return "";
        }
        if (dend <= dotPos) {
            return null;
        }
        if (len - dotPos > decimalDigits) {
            return "";
        }
    }
    return null;
}


public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
    int dotPos = -1;
    int len = dest.length();
    for(int i = 0; i < len; i++) {
        char c = dest.charAt(i);
        if (c == '.' || c == ',') {
            dotPos = i;
            break;
        }
    }
    if (dotPos >= 0) {
        if (source.equals(".") || source.equals(",")) {
            return "";
        }
        if (dend <= dotPos) {
            return null;
        }
        if (len - dotPos > decimalDigits) {
            return "";
        }
    }
    char c;
    for (int i = start; i < end; ++i) {
        c = source.charAt(i);
        if (!Character.isDigit(c) && c != '.' && c != ',') {
            return null;
        } 
    }
    return null;
}
