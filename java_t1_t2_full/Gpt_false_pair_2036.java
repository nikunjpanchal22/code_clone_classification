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
    int positionOfDot = -1;
    int length = dest.length();
    for (int iter=0; iter < length; iter++) {
        char character = dest.charAt(iter);
        if (character == '.' || character == ',') {
            positionOfDot = iter;
            break;
        }
    }
    if (positionOfDot >= 0) {
        if (source.equals (".") || source.equals (",")) {
            return "";
        }
        if (dend <= positionOfDot) {
            return null;
        }
        if (length - positionOfDot > decimalDigits) {
            return "";
        }
    }
    return null;
}
