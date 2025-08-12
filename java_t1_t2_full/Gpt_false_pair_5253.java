public static void main (String [] args) {
    String string = "aaabbbbbaccc";
    int counter;
    String result = "";
    int i = 0;
    while (i < string.length ()) {
        counter = 1;
        for (int j = i + 1;
        j < string.length (); j ++) {
            System.out.println ("string length =" + string.length ());
            if (string.charAt (i) == string.charAt (j)) {
                counter ++;
            }
        }
        result = result + string.charAt (i) + counter;
        string = string.replaceAll (String.valueOf (string.charAt (i)), "");
    }
    System.out.println ("result is = " + result);
}


public static void main (String [] args) {
    String word = "aaabbbbbaccc";
    int counter;
    String result = "";
    int i = 0;
    while (i < word.length ()) {
        counter = 1;
        for (int j = i + 1;
        j < word.length (); j ++) {
            System.out.println ("word length =" + word.length ());
            if (word.charAt (i) == word.charAt (j)) {
                counter ++;
            }
        }
        result = result + word.charAt (i) + counter;
        word = word.replaceAll (String.valueOf (word.charAt (i)), "");
    }
    System.out.println ("result is = " + result);
}
