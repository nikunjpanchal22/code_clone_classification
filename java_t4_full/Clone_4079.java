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
    Scanner scanner = new Scanner (System.in);
    System.out.print ("Enter a String : ");
    String str = scanner.nextLine ();
    int len = str.length ();
    for (char char1 = 'A'; char1 <= 'z'; char1 ++) {
        for (char char2 = 'A'; char2 <= 'z'; char2 ++) {
            String result = new String (new char [] {char1, char2});
            int k = 0;
            for (int index = 0; index < len - 1; index ++) {
                String sub = str.substring (index, index + 2);
                if (result.equals (sub)) {
                    k ++;
                }
            }
            if (k > 0) {
                System.out.println ("" + result + ": " + k);
            }
        }
    }
}


