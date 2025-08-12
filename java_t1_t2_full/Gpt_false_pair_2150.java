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
        int dotMarkPosition = -1;
        int stringLength = dest.length();
        for(int i=0;i<stringLength;i++){
            char character = dest.charAt(i);
            if(character == '.' || character == ','){
                dotMarkPosition = i;
                break;
            }
        }
        if(dotMarkPosition >= 0){
            if(source.equals(".") || source.equals(",")){
                return "";
            }
            if(dend <= dotMarkPosition){
                return null;
            }
            if(stringLength - dotMarkPosition > decimalDigits){
                return "";
            }
        }
        return null;
}
