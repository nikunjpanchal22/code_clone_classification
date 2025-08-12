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
public class Counter {
    public static void main (String[] args) {
        String stringIn, result, slice;
        int i, j, k, occurrences = 0;
        char firstChar, secondChar;
        Scanner input = new Scanner (System.in);
        System.out.print ("Enter a String : ");
        stringIn = input.nextLine ();
        i = stringIn.length ();
        for (firstChar = 'A'; firstChar <= 'z'; firstChar ++) {
            for (secondChar = 'A'; secondChar <= 'z'; secondChar ++) {
                result = new String (new char [] {firstChar, secondChar});
                occurrences = 0;
                for (j = 0; j < i - 1; j ++) {
                    slice = stringIn.substring (j, j + 2);
                    if (result.equals (slice)) occurrences ++;
                }
                if (occurrences > 0) System.out.println ("" + result + ": " + occurrences);
            }
        }
    }
}


