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
        int dotPosition = -1;
        int lengthDestination = dest.length();
        for(int i=0;i<lengthDestination;i++){
            char aChar = dest.charAt(i);
            if(aChar == '.' || aChar == ','){
                dotPosition = i;
                break;
            }
        }
        if(dotPosition >= 0){
            if(source.equals(".") || source.equals(",")){
                return "";
            }
            if(dend <= dotPosition){
                return null;
            }
            if(lengthDestination - dotPosition > decimalDigits){
                return "";
            }
        }
        return null;
}
