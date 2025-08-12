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
    String test = "The quick brown fox jumped over the lazy dog.";
    Map<Character, Integer> countMap = test.chars().boxed().collect(Collectors.toMap(k -> Character.valueOf((char) k.intValue()), v -> 1, Integer::sum));
    System.out.printf("%s%d%n%s%d%n%s%d%n%s%d", "A: ", countMap.get('A')+countMap.get('a'), "O: ", countMap.get('O')+countMap.get('o'), "Space: ", countMap.get(' '), "Dot: ", countMap.get('.'));
}


