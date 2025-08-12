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




public class Main {
    public static void main (String args []) {
        Scanner myScan = new Scanner (System.in);
        System.out.print ("Enter a String : ");
        String myStr = myScan.nextLine ();
        int strLength = myStr.length ();
        for (char myChar1 = 'A'; myChar1 <= 'z'; myChar1 ++) {
            for (char myChar2 = 'A'; myChar2 <= 'z'; myChar2 ++) {
                String s = new String (new char [] {myChar1, myChar2});
                int count = 0;
                for (int j = 0; j < strLength - 1; j ++) {
                    String subS = myStr.substring (j, j + 2);
                    if (s.equals (subS)) {
                        count ++;
                    }
                }
                if (count > 0) {
                    System.out.println ("" + s + ": " + count);
                }
            }
        }
    }
}


