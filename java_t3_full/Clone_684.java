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
        for (int i = 0;
        i < test.length (); i ++) {
            switch (test.charAt (i)) {
                case 97 :
                case 65 :
                    countA ++;
                    break;
                case 111 :
                case 79 :
                    countO ++;
                    break;
                case 32 :
                    countSpace ++;
                    break;
                case 46 :
                    countDot ++;
                    break;
            }
        }
        System.out.printf ("%s%d%n%s%d%n%s%d%n%s%d", "A: ", countA, "O: ", countO, "Space: ", countSpace, "Dot: ", countDot);
}


