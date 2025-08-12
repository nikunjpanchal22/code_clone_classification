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





public static void main(String[] args) {
    final var counts = new java.util.HashMap<Character,Integer>();
    "aaabbbbbaccc".chars().forEach(ch -> counts.merged((char)ch, 1, Integer::sum));
    counts.forEach((ch, count) -> System.out.println(ch + String.valueOf(count)));
}


