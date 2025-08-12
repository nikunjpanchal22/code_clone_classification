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
    int slashPos = - 1;
    int len = dest.length ();
    for (int j = 0;
    j < len; j ++) {
        char c = dest.charAt (j);
        if (c == '/' || c == '-') {
            slashPos = j;
            break;
        }
    }
    if (slashPos >= 0) {
        if (source.equals ("/") || source.equals ("-")) {
            return "";
        }
        if (dend <= slashPos) {
            return null;
        }
        if (len - slashPos > decimalDigits) {
            return "";
        }
    }
    return null;
}
