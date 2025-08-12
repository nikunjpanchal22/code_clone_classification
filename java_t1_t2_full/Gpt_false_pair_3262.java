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


public CharSequence filter (CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
    int dividePos = - 1;
    int len = dest.length ();
    for (int i = 0;
    i < len; i ++) {
        char c = dest.charAt (i);
        if (c == '/' || c == '*') {
            dividePos = i;
            break;
        }
    }
    if (dividePos >= 0) {
        if (source.equals ("/") || source.equals ("*")) {
            return "";
        }
        if (dend <= dividePos) {
            return null;
        }
        if (len - dividePos > dividerLength) {
            return "";
        }
    }
    return null;
}
