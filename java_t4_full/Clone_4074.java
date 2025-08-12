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




import java.util.Scanner;
class TestMain {
    public static void main (String args []) {
        String line, result, subStr;
        int i, total = 0;
        char c3, c4;
        Scanner scan = new Scanner (System.in);
        System.out.print ("Enter a String : ");
        line = scan.nextLine ();
        i = line.length ();
        for (c3 = 'A'; c3 <= 'z'; c3 ++) {
            for (c4 = 'A'; c4 <= 'z'; c4 ++) {
                result = String.valueOf(new char [] {c3, c4});
                total = 0;
                for (int x = 0; x < i - 1; x ++) {
                    subStr = line.substring (x, x + 2);
                    if (result.equals (subStr)) total ++;
                }
                if (total > 0) System.out.println ("" + result + ": " + total);
            }
        }
    }
}


