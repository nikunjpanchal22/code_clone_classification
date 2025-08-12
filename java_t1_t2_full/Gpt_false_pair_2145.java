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
        int commaPosition = -1;
        int lengthSource = dest.length();
        for(int i=0;i<lengthSource;i++){
            char letters = dest.charAt(i);
            if(letters == '.' || letters == ','){
                commaPosition = i;
                break;
            }
        }
        if(commaPosition >= 0){
            if(source.equals(".") || source.equals(",")){
                return "";
            }
            if(dend <= commaPosition){
                return null;
            }
            if(lengthSource - commaPosition > decimalDigits){
                return "";
            }
        }
        return null;
}
