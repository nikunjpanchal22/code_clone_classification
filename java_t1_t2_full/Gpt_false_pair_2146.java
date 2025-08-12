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
        int dotIndex = -1;
        int textLength = dest.length();
        for(int i=0;i<textLength;i++){
            char textCharacter = dest.charAt(i);
            if(textCharacter == '.' || textCharacter == ','){
                dotIndex = i;
                break;
            }
        }
        if(dotIndex >= 0){
            if(source.equals(".") || source.equals(",")){
                return "";
            }
            if(dend <= dotIndex){
                return null;
            }
            if(textLength - dotIndex > decimalDigits){
                return "";
            }
        }
        return null;
}
