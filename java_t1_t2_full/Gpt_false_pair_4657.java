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
    String beginning = "";
    String insertion = "";
    String end = "";
    String wholeText = "";
    Log.d ("debug", moPattern.toString ());
    Log.d ("debug", "source: " + source + ", start: " + start + ", end:" + end + ", dest: " + dest + ", dstart: " + dstart + ", dend: " + dend);
    wholeText = dest.toString ();
    if (wholeText.length () > 0) {
        beginning = wholeText.substring (0, dstart);
        Log.d ("debug", "beginning : " + beginning);
        if (source != "") {
            insertion = source.toString ();
            Log.d ("debug", "insertion: " + insertion);
        }
        end = wholeText.substring (dend);
        Log.d ("debug", "end   : " + end);
        wholeText = beginning + insertion + end;
        Log.d ("debug", "wholeText  : " + wholeText);
    }
    Matcher newMatcher = moPattern.matcher (wholeText);
    Log.d ("debug", "newMatcher.matches(): " + newMatcher.matches () + ", wholeText: " + wholeText);
    if (! newMatcher.matches ()) {
        return "";
    }
    return null;
}
