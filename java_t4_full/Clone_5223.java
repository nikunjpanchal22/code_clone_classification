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
    String s = "aaabbbbbaccc";
    java.util.Map<Character, Long> counts = s.chars().mapToObj(c -> (char) c).collect(java.util.stream.Collectors.groupingBy(java.util.function.Function.identity(), java.util.stream.Collectors.counting()));
    System.out.println(counts.entrySet().stream().map(e -> "" + e.getKey() + e.getValue()).collect(java.util.stream.Collectors.joining()));
}


