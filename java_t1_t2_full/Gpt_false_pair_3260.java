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


public CharSequence filter(CharSequence argSource, int argStart, int argEnd, Spanned argDest, int argDstart, int argDend) {
    int dotPos = -1;
    int len = argDest.length();
    for (int i = 0;
    i < len; i++) {
        char c = argDest.charAt(i);
        if (c == '.' || c == ',') {
            dotPos = i;
            break;
        }
    }
    if (dotPos >= 0) {
        if (argSource.equals(".") || argSource.equals(",")) {
            return "";
        }
        if (argDend <= dotPos) {
            return null;
        }
        if (len - dotPos > decimalDigits) {
            return "";
        }
    }
    return null;
}
