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
        int indexOfCommaOrDot = -1;
        int lengthOfDestination = dest.length();
        for(int i=0;i<lengthOfDestination;i++){
            char destinationChar = dest.charAt(i);
            if(destinationChar == '.' || destinationChar == ','){
                indexOfCommaOrDot = i;
                break;
            }
        }
        if(indexOfCommaOrDot >= 0){
            if(source.equals(".") || source.equals(",")){
                return "";
            }
            if(dend <= indexOfCommaOrDot){
                return null;
            }
            if(lengthOfDestination - indexOfCommaOrDot > decimalDigits){
                return "";
            }
        }
        return null;
}
