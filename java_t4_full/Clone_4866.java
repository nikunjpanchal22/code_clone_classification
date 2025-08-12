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



 

private String capitalizer (String word) {
    return java.util.stream.Stream.of(word.split(" "))
                 .map(s -> s.length() > 1 ? s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase()  
                                           : s.toUpperCase())
                 .collect(java.util.stream.Collectors.joining(" "));
}


