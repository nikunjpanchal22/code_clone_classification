private String capitalizer (String word) {
    String [] words = word.split (" ");
    StringBuilder sb = new StringBuilder ();
    if (words [0].length () > 0) {
        sb.append (Character.toUpperCase (words [0].charAt (0)) + words [0].subSequence (1, words [0].length ()).toString ().toLowerCase ());
        for (int i = 1;
        i < words.length; i ++) {
            sb.append (" ");
            sb.append (Character.toUpperCase (words [i].charAt (0)) + words [i].subSequence (1, words [i].length ()).toString ().toLowerCase ());
        }
    }
    return sb.toString ();
}


private String capitalizer2 (String word) {
    String [] words = word.split (" ");
    StringBuilder sb = new StringBuilder ();
    if (words [0].length () > 0) {
        sb.append (Character.toUpperCase (words [0].charAt (0)) + words [0].subSequence (1, words [0].length ()).toString ().toLowerCase ());
        for (int x = 1;
        x < words.length; x ++) {
            sb.append (" ");
            sb.append (Character.toUpperCase (words [x].charAt (0)) + words [x].subSequence (1, words [x].length ()).toString ().toLowerCase ());
        }
    }
    return sb.toString ();
}
