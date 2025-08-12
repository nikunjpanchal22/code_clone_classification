public static void main (String [] args) {
    String test = "The quick brown fox jumped over the lazy dog.";
    int countA = 0, countO = 0, countSpace = 0, countDot = 0;
    for (int i = 0;
    i < test.length (); i ++) {
        switch (test.charAt (i)) {
            case 'a' :
            case 'A' :
                countA ++;
                break;
            case 'o' :
            case 'O' :
                countO ++;
                break;
            case ' ' :
                countSpace ++;
                break;
            case '.' :
                countDot ++;
                break;
        }
    }
    System.out.printf ("%s%d%n%s%d%n%s%d%n%s%d", "A: ", countA, "O: ", countO, "Space: ", countSpace, "Dot: ", countDot);
}




public static void main(String[] args) {
    String test = "The quick brown fox jumps over the lazy dog.";
    Map<Character, Long> counts = test.chars().mapToObj(i -> (char)i).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    System.out.printf ("%s%d%n%s%d%n%s%d%n%s%d", "A: ", counts.getOrDefault('a', 0L) + counts.getOrDefault('A', 0L), 
                                                "O: ", counts.getOrDefault('o', 0L) + counts.getOrDefault('O', 0L), 
                                                "Space: ", counts.getOrDefault(' ', 0L),
                                                "Dot: ", counts.getOrDefault('.', 0L));
}


