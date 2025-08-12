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
    String input = scanner.nextLine ();
    int i = input.length ();
    for (char c1 = 'A'; c1 <= 'z'; c1 ++) {
        for (char c2 = 'A'; c2 <= 'z'; c2 ++) {
            String result = new String (new char [] {c1, c2});
            int k = 0;
            for (int j = 0; j < i - 1; j ++) {
                String subString = input.substring (j, j + 2);
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


