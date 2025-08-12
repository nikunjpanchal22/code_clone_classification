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
    int ci = 0, i = 0, j = 0, k = 0, l = 0;
    String str = null, str1 = null, result = null, subString = null;
    char c1 = 'A', c2 = 'A', ch = '';
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a String : ");
    str = scan.nextLine();
    i = str.length();
    int c1Parser = 'A'; 
    while (c1Parser < 'z') { 
        int c2Parser = 'A'; 
        while (c2Parser <= 'z') {
            result = new String(new char[]{c1Parser, c2Parser});
            k = 0;
            j = 0;
            while (j < i - 1) {
                subString = str.substring(j, j + 2);
                if (result.equals(subString)) {
                    k++;
                }
                j++;
            }
            if (k > 0) {
                System.out.println("" + result + ": " + k);
            }
            c2Parser++;
        }
        c1Parser++;
    }
}


