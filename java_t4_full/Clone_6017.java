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



public CharSequence filter (CharSequence iSource, int start, int end, Spanned dest, int dstart, int dend) {
    String startStr = dest.subSequence(0, dstart).toString();
    String replacement = (iSource != null) ? iSource.subSequence(start, end).toString() : "";
    String endStr = dest.subSequence(dend, dest.length()).toString();
    String newText = startStr + replacement + endStr;
    Pattern testPattern = Pattern.compile("^\\w*$");
    Matcher matcher = testPattern.matcher(newText);
    boolean isMatch = matcher.matches();
    if (!isMatch) return "";
    return null;
}


