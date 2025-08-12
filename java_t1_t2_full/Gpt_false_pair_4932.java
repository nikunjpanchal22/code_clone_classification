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
    String lsStart = "";
    String lsInsert = "";
    String lsEnd = "";
    String lsText = "";
    Log.d ("debug", moPattern.toString () + "; Process: " + source + ", Start Value: " + start + ", End Value: " + end + ", Saved Text: " + dest + ", Started Position: " + dstart + ", Ended: " + dend);
    lsText = dest.toString ();
    if (lsText.length () > 0) {
        lsStart = lsText.substring (0, dstart);
        Log.d ("debug", "Beginning String: " + lsStart);
        if (source != "") {
            lsInsert = source.toString ();
            Log.d ("debug", "Placement String: " + lsInsert);
        }
        lsEnd = lsText.substring (dend);
        Log.d ("debug", "Completion String: " + lsEnd);
        lsText = lsStart + lsInsert + lsEnd;
        Log.d ("debug", "Total String: " + lsText);
    }
    Matcher loMatcher = moPattern.matcher (lsText);
    Log.d ("debug", "Matched Filtering: " + loMatcher.matches () + ", Pertinent Values: " + lsText);
    if (! loMatcher.matches ()) {
        return "";
    }
    return null;
}
