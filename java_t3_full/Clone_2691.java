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
public class MainClass {
    public static void main (String args []) {
        String stringS, stringSub, stringRes;
        int length, index, occurrence = 0;
        char charA, charB;
        Scanner scn = new Scanner (System.in);
        System.out.print ("Enter a String : ");
        stringS = scn.nextLine ();
        length = stringS.length ();
        for (charA = 'A'; charA <= 'z'; charA ++) {
            for (charB = 'A'; charB <= 'z'; charB ++) {
                stringRes = new String (new char [] {charA, charB});
                occurrence = 0;
                for (index = 0; index < length - 1; index ++) {
                    stringSub = stringS.substring (index, index + 2);
                    if (stringRes.equals (stringSub)) occurrence ++;
                }
                if (occurrence > 0) System.out.println ("" + stringRes + ": " + occurrence);
            }
        }
    }
}


