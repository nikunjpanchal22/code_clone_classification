public static void main (String [] args) {
    String s = "this is a this is this a this yes this is a this what it may be i do not care about this";
    String a [] = s.split (" ");
    Map < String, Integer > words = new HashMap < > ();
    for (String str : a) {
        if (words.containsKey (str)) {
            words.put (str, 1 + words.get (str));
        } else {
            words.put (str, 1);
        }
    }
    System.out.println (words);
}


 public static void main (String [] args) {
    String s = "this is a this is this a this yes this is a this what it may be i do not care about this";
    String [] a = s.split(" +");
    HashMap<String, Integer> words = new HashMap<>();
    for (String str : a) {
        if (words.containsKey(str)) {
            words.put(str, words.get(str) +1);
        } else {
            words.put(str, 1);
        }
    }
    System.out.println(words);
}
