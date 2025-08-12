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





public static void main (String [] args) {
    String test = "The quick brown fox jumped over the lazy dog.";
    int countA = 0, countO = 0, countSpace = 0, countDot = 0;
    for (char c : test.toUpperCase().toCharArray())
        countA += (c == 'A')? 1 : 0;
        countO += (c == 'O')? 1 : 0;
        countSpace += (c == ' ')? 1 : 0;
        countDot += (c == '.')? 1 : 0;
    System.out.printf ("A: %d\nO: %d\nSpace: %d\nDot: %d", countA, countO, countSpace, countDot);
}


