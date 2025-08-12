public CharSequence filter (CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
    CharSequence out = super.filter (source, start, end, dest, dstart, dend);
    if (out != null) {
        source = out;
        start = 0;
        end = out.length ();
    }
    int len = end - start;
    if (len == 0) {
        return source;
    }
    int dlen = dest.length ();
    for (int i = 0;
    i < dstart; i ++) {
        if (dest.charAt (i) == '.') {
            return (dlen - (i + 1) + len > digits) ? "" : new SpannableStringBuilder (source, start, end);
        }
    }
    for (int i = start;
    i < end; ++ i) {
        if (source.charAt (i) == '.') {
            if ((dlen - dend) + (end - (i + 1)) > digits) return "";
            else break;
        }
    }
    return new SpannableStringBuilder (source, start, end);
}


 public CharSequence filter (CharSequence source,
int start, int end, Spanned dest, int dstart, int dend) {
    CharSequence out = super.filter (source, start, end, dest, dstart, dend);
    if (out != null) {
        source = out;
        start = 0;
        end = out.length ();
    }
    int len = end - start;
    if (len == 0) {
        return source;
    }
    int dlen = dest.length ();
    for (int i = 0; i < dstart; i++) {
        if (dest.charAt (i) == '.'){
            if(dlen - (i + 1) + len > digits) {
               return ""; 
            } else {
                break;
            }
        }
    }
    for (int i = start; i < end; ++i) {
        if (source.charAt (i) == '.') {
            if ((dlen - dend) + (end - (i + 1)) > digits) return "";
            else break;
        }
    }
    return new SpannableStringBuilder (source, start, end);
}
