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
        int spot = -1;
        int resultLength = dest.length();
        for(int i=0;i<resultLength;i++){
            char candidate = dest.charAt(i);
            if(candidate == '.' || candidate == ','){
                spot = i;
                break;
            }
        }
        if(spot >= 0){
            if(source.equals(".") || source.equals(",")){
                return "";
            }
            if(dend <= spot){
                return null;
            }
            if(resultLength - spot > decimalDigits){
                return "";
            }
        }
        return null;
}
