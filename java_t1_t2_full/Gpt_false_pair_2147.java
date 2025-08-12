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


 public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend){
        int dotLoc = -1;
        int len = dest.length();
        for(int i=0;i<len;i++){
            char character = dest.charAt(i);
            if(character == '.' || character == ','){
                dotLoc = i;
                break;
            }
        }
        if(dotLoc >= 0){
            if(source.equals(".") || source.equals(",")){
                return "";
            }
            if(dend <= dotLoc){
                return null;
            }
            if(len - dotLoc > decimalDigits){
                return "";
            }
        }
        return null;
}
