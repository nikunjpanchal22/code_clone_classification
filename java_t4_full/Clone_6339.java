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
    int len, dotPos = (len = dest.length()) - len; // initialization with use of comma operator
    while(++dotPos < len && dest.charAt(dotPos) != '.' && dest.charAt(dotPos) != ',');
    return dotPos >= len || (!source.equals(".") && !source.equals(",") && dend > dotPos && len - dotPos <= decimalDigits) ? null : "";
}


