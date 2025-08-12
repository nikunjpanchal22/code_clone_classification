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

    char[] arr = new char[dest.length()];
    TextUtils.getChars(dest, 0, dest.length(), arr, 0);
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == '.' || arr[i] == ',') {
            dotPos = i;
            break;
        }
    }

    if (dotPos != -1 && (source.toString().contains(".") || dstart <= dotPos || dest.length() - dotPos > decimalDigits)) {
        return "";
    }
    return null;
}


