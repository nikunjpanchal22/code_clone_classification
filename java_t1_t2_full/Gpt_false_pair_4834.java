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


public CharSequence filter (CharSequence item, int startIndex, int endIndex, Spanned sections, int begin, int end) {
    int pointPos = - 1;
    int length = sections.length ();
    for (int i = 0;
    i < length; i ++) {
        char letter = sections.charAt (i);
        if (letter == '.' || letter == ',') {
            pointPos = i;
            break;
        }
    }
    if (pointPos >= 0) {
        if (item.equals (".") || item.equals (",")) {
            return "";
        }
        if (end <= pointPos) {
            return null;
        }
        if (length - pointPos > decimalDigits) {
            return "";
        }
    }
    return null;
}
