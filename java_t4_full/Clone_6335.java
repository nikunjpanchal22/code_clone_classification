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
    int len = dest.length();
    int dotPos = dest.toString().contains(".") ? dest.toString().indexOf(".") : dest.toString().contains(",") ? dest.toString().indexOf(",") : -1;
    if (dotPos >= 0 && (source.equals(".") || source.equals(",") || dend <= dotPos || len - dotPos > decimalDigits)) 
        return "";
    return null;
}


