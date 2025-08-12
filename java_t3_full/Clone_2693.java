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
    String str;
    char c1, c2;
    Scanner scan = new Scanner (System.in);
    System.out.print ("Enter a String : ");
    str = scan.nextLine ();
    int length = str.length ();
    for (c1 = 'A'; c1 <= 'z'; c1 ++) {
        for (c2 = 'A'; c2 <= 'z'; c2 ++) {
            String result = Character.toString(c1) + Character.toString(c2);
            int count = 0;
            for (int j = 0; j < length - 1; j ++) {
                String sub = str.substring (j, j + 2);
                if (result.equals (sub)) {
                    count ++;
                }
            }
            if (count > 0) {
                System.out.println ("" + result + ": " + count);
            }
        }
    }
}


