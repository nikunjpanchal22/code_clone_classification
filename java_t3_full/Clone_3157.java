public CharSequence filter (CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
    String replacement = source.subSequence (start, end).toString ();
    String newVal = dest.subSequence (0, dstart).toString () + replacement + dest.subSequence (dend, dest.length ()).toString ();
    Matcher matcher = mPattern.matcher (newVal);
    if (matcher.matches ()) return null;
    if (TextUtils.isEmpty (source)) return dest.subSequence (dstart, dend);
    else return "";
}



 

public CharSequence filter(CharSequence s, int begin, int finish, Spanned spanned, int start, int end) {
    String str = s.subSequence(begin, finish).toString();
    String newVal = spanned.subSequence(0, start).toString() + str + spanned.subSequence(end, spanned.length()).toString();
    Matcher m = mPattern.matcher(newVal);
    return m.matches() ? null : (TextUtils.isEmpty(s) ? spanned.subSequence(start, end) : "");
}


