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


public CharSequence filter (CharSequence source, int begin, int end, Spanned dest, int start, int stop) {
    int spotPos = - 1;
    int length = dest.length ();
    for (int i = 0;
    i < length; i ++) {
        char character = dest.charAt (i);
        if (character == '.' || character == ',') {
            spotPos = i;
            break;
        }
    }
    if (spotPos >= 0) {
        if (source.equals (".") || source.equals (",")) {
            return "";
        }
        if (stop <= spotPos) {
            return null;
        }
        if (length - spotPos > decimalDigits) {
            return "";
        }
    }
    return null;
}
