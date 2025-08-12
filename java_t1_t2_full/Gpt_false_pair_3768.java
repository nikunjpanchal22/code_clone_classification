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
    String start = "";
    String insert = "";
    String end = "";
    String text = "";
    Log.d ("debug", moPattern.toString ());
    Log.d ("debug", "source: " + source + ", start: " + start + ", end:" + end + ", dest: " + dest + ", dstart: " + dstart + ", dend: " + dend);
    text = dest.toString ();
    if (text.length () > 0) {
        start = text.substring (0, dstart);
        Log.d ("debug", "start : " + start);
        if (source != "") {
            insert = source.toString ();
            Log.d ("debug", "insert: " + insert);
        }
        end = text.substring (dend);
        Log.d ("debug", "end   : " + end);
        text = start + insert + end;
        Log.d ("debug", "text  : " + text);
    }
    Matcher matcher = moPattern.matcher (text);
    Log.d ("debug", "matcher.matches(): " + matcher.matches () + ", text: " + text);
    if (! matcher.matches ()) {
        return "";
    }
    return null;
}
