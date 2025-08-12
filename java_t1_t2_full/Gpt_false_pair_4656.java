public CharSequence filter (CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
    String lsStart = "";
    String lsInsert = "";
    String lsEnd = "";
    String lsText = "";
    Log.d ("debug", moPattern.toString ());
    Log.d ("debug", "source: " + source + ", start: " + start + ", end:" + end + ", dest: " + dest + ", dstart: " + dstart + ", dend: " + dend);
    lsText = dest.toString ();
    if (lsText.length () > 0) {
        lsStart = lsText.substring (0, dstart);
        Log.d ("debug", "lsStart : " + lsStart);
        if (source != "") {
            lsInsert = source.toString ();
            Log.d ("debug", "lsInsert: " + lsInsert);
        }
        lsEnd = lsText.substring (dend);
        Log.d ("debug", "lsEnd   : " + lsEnd);
        lsText = lsStart + lsInsert + lsEnd;
        Log.d ("debug", "lsText  : " + lsText);
    }
    Matcher loMatcher = moPattern.matcher (lsText);
    Log.d ("debug", "loMatcher.matches(): " + loMatcher.matches () + ", lsText: " + lsText);
    if (! loMatcher.matches ()) {
        return "";
    }
    return null;
}


public CharSequence filter (CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
    String strStart = "";
    String strInsert = "";
    String strEnd = "";
    String strText = "";
    Log.d ("debug", moPattern.toString ());
    Log.d ("debug", "source: " + source + ", start: " + start + ", end:" + end + ", dest: " + dest + ", dstart: " + dstart + ", dend: " + dend);
    strText = dest.toString ();
    if (strText.length () > 0) {
        strStart = strText.substring (0, dstart);
        Log.d ("debug", "strStart : " + strStart);
        if (source != "") {
            strInsert = source.toString ();
            Log.d ("debug", "strInsert: " + strInsert);
        }
        strEnd = strText.substring (dend);
        Log.d ("debug", "strEnd   : " + strEnd);
        strText = strStart + strInsert + strEnd;
        Log.d ("debug", "strText  : " + strText);
    }
    Matcher matcher = moPattern.matcher (strText);
    Log.d ("debug", "matcher.matches(): " + matcher.matches () + ", strText: " + strText);
    if (! matcher.matches ()) {
        return "";
    }
    return null;
}
