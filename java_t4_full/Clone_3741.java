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
            List<String> list = Arrays.asList(test.split(""));
            countElement(list, "a");
            countElement(list, "o");
            countElement(list, " ");
            countElement(list, ".");
        }

        public static void countElement(List<String> test, String s) {
            System.out.println(s + ": " + Collections.frequency(test, s));
}


