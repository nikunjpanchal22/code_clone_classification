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
    int[] counts = new int[4];
    for (char ch : test.toCharArray()) {
        counts[0] += ch == 'a' || ch == 'A' ? 1 : 0;
        counts[1] += ch == 'o' || ch == 'O' ? 1 : 0;
        counts[2] += ch == ' ' ? 1 : 0;
        counts[3] += ch == '.' ? 1 : 0;
    }
    System.out.printf ("%s%d%n%s%d%n%s%d%n%s%d", "A: ", counts[0], "O: ", counts[1], "Space: ", counts[2], "Dot: ", counts[3]);
}


