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
    String str = "The quick brown fox jumped over the lazy dog.";
    Map<Character, Long> count = str.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    System.out.printf("A: %d\nO: %d\nSpace: %d\nDot: %d", count.getOrDefault('a', 0L)+count.getOrDefault('A', 0L), count.getOrDefault('o', 0L)+count.getOrDefault('O', 0L), count.getOrDefault(' ', 0L), count.getOrDefault('.', 0L));
}


