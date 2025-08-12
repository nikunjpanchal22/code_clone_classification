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


 public CharSequence filter (CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {char[] lsStart = new char[dstart], lsInsert = new char[end-start], lsEnd = new char[dest.length()-dend];
   dest.subSequence(0, dstart).getChars(0, dstart-1, lsStart, 0);
   source.subSequence(start, end).getChars(0, end-start-1, lsInsert, 0);
   dest.subSequence(dend, dest.length()).getChars(0, dest.length()-dend-1, lsEnd, 0);
   String lsText = new String(lsStart) + new String(lsInsert) + new String(lsEnd);
   Matcher loMatcher = moPattern.matcher(lsText);
   if (!loMatcher.matches())
       return "";
   return null;
}


