public static void main (String args []) {
    int ci, i, j, k, l = 0;
    String str, str1, result, subString;
    char c1, c2, ch;
    Scanner scan = new Scanner (System.in);
    System.out.print ("Enter a String : ");
    str = scan.nextLine ();
    i = str.length ();
    for (c1 = 'A'; c1 <= 'z'; c1 ++) {
        for (c2 = 'A'; c2 <= 'z'; c2 ++) {
            result = new String (new char [] {c1, c2});
            k = 0;
            for (j = 0; j < i - 1; j ++) {
                subString = str.substring (j, j + 2);
                if (result.equals (subString)) {
                    k ++;
                }
            }
            if (k > 0) {
                System.out.println ("" + result + ": " + k);
            }
        }
    }
}




public static void main (String args []) {
    String userInput, pair, temporary;
    char charOne, charTwo;
    Scanner scanMe = new Scanner (System.in);
    System.out.print ("Enter a String : ");
    userInput = scanMe.nextLine ();
    int length = userInput.length ();
    for (charOne = 'A'; charOne <= 'z'; charOne ++) {
        for (charTwo = 'A'; charTwo <= 'z'; charTwo ++) {
            pair = new String (new char [] {charOne, charTwo});
            int pairCount = 0;
            for (int i = 0; i < length - 1; i ++) {
                temporary = userInput.substring (i, i + 2);
                if (pair.equals (temporary)) {
                    pairCount ++;
                }
            }
            if (pairCount > 0) {
                System.out.println ("Pair " + pair + " occurs: " + pairCount + " times.");
            }
        }
    }
}


