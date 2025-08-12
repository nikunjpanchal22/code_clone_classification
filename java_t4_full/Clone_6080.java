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


 
public CharSequence filter(CharSequence s, int st, int e, Spanned d, int dst, int de) {
    int dp=-1, length=d.length();
    for(int i=0;i<length;i++){
        char ch=d.charAt(i);
        if(ch=='.'||ch==','){dp=i;break;}
    }
    if(dp>=0){
        if(s.equals(".")||s.equals(",")) return "";
        if(de<=dp) return null;
        if(length-dp>decimalDigits) return "";
    }
    return null;
}


