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
    Map<Character, Integer> charCount = new HashMap<>();
    for (char c : test.toCharArray()) {
        charCount.put(c, charCount.getOrDefault(c, 0)+1);
    }
    System.out.printf ("%s%d%n%s%d%n%s%d%n%s%d", "A: ", charCount.getOrDefault('a', 0) + charCount.getOrDefault('A', 0), 
                                                "O: ", charCount.getOrDefault('o', 0) + charCount.getOrDefault('O', 0), 
                                                "Space: ", charCount.get(' '), 
                                                "Dot: ", charCount.get('.'));
}


