public static void main (String [] args) {
    String word = "a b c";
    int i = 0, spaceCount = 0;
    while (i < word.length ()) {
        if (word.charAt (i) == ' ') {
            spaceCount ++;
        }
        i ++;
    }
    System.out.println ("Spaces in string: " + spaceCount);
}


 public static void main (String [] args) {
    String word = "a b c";
    int spaceCount = 0;
    for (String s : word.split("\\s+")) {
        spaceCount++;
    }
    System.out.println ("Spaces in string: " + spaceCount);
}


