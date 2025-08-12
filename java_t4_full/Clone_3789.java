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





public static void main(String[] args){
    String test = "The quick brown fox jumped over the lazy dog.";
    int[] counts = new int[4];
    test.chars().forEach(c -> {
        if(c=='a'||c=='A') counts[0]++;
        else if (c == 'o'|| c=='O') counts[1]++;
        else if (c == ' ') counts[2]++;
        else if (c == '.') counts[3]++;
    });
    System.out.printf ("%s%d%n%s%d%n%s%d%n%s%d", "A: ", counts[0], "O: ", counts[1], "Space: ", counts[2], "Dot: ", counts[3]);
}


