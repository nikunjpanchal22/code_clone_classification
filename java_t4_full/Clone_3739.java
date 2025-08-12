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
    long countA = test.chars().filter(c -> c == 'a' || c == 'A').count();
    long countO = test.chars().filter(c -> c == 'o' || c == 'O').count();
    long countSpace = test.chars().filter(c -> c == ' ').count();
    long countDot = test.chars().filter(c -> c == '.').count();

    System.out.printf("A: %d\nO: %d\nSpace: %d\nDot: %d", countA, countO, countSpace, countDot);
}


