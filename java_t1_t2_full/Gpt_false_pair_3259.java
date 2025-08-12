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


public CharSequence filter (CharSequence inSource, int inStart, int inEnd, Spanned inDest, int inDstart, int inDend) {
    int dotPos = - 1;
    int len = inDest.length();
    for (int i = 0;
    i < len; i++) {
        char j = inDest.charAt(i);
        if (j == '.' || j == ',') {
            dotPos = i;
            break;
        }
    }
    if (dotPos >= 0) {
        if (inSource.equals(".") || inSource.equals(",")) {
            return "";
        }
        if (inDend <= dotPos) {
            return null;
        }
        if (len - dotPos > decimalDigits) {
            return "";
        }
    }
    return null;
}
