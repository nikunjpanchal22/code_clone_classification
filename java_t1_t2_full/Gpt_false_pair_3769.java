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


public CharSequence filter (CharSequence source, int startPos, int endPos, Spanned dest, int start, int end) {
    String beginning = "";
    String added = "";
    String remainder = "";
    String fullText = "";
    Log.d ("debug", moPattern.toString ());
    Log.d ("debug", "source: " + source + ", start: " + startPos + ", end:" + endPos + ", dest: " + dest + ", dstart: " + start + ", dend: " + end);
    fullText = dest.toString ();
    if (fullText.length () > 0) {
        beginning = fullText.substring (0, start);
        Log.d ("debug", "beginning : " + beginning);
        if (source != "") {
            added = source.toString ();
            Log.d ("debug", "added: " + added);
        }
        remainder = fullText.substring (end);
        Log.d ("debug", "remainder   : " + remainder);
        fullText = beginning + added + remainder;
        Log.d ("debug", "fullText  : " + fullText);
    }
    Matcher matcher = moPattern.matcher (fullText);
    Log.d ("debug", "matcher.matches(): " + matcher.matches () + ", fullText: " + fullText);
    if (! matcher.matches ()) {
        return "";
    }
    return null;
}
