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



public CharSequence filter(CharSequence source, int st, int en, Spanned dest, int ds, int de) {
    int dp=-1, len=dest.length();
    for(int i=0;i<len;i++){
        char c=dest.charAt(i);
        if(c=='.'||c==','){dp=i;break;}
    }
    if(dp>=0){
        if(source.equals(".")||source.equals(",")) return "";
        if(de<=dp) return null;
        if(len-dp>decimalDigits) return "";
    }
    return null;
}


