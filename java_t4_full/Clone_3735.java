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
    Map<Character, Integer> countMap = new HashMap<>();

    for (int i=0; i<test.length(); i++) {
        char ch = test.charAt(i);
        countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
    }

    System.out.println("A: " + (countMap.get('a')+countMap.get('A')));
    System.out.println("O: " + (countMap.get('o')+countMap.get('O')));
    System.out.println("Space: " + countMap.get(' '));
    System.out.println("Dot: " + countMap.get('.'));
}


