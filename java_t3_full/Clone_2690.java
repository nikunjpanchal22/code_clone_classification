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
class StringAnalyzer {
    public static void main(String args[]) {
        String inputString, stringUnit, comparisonPart;
        int i, j, occurrenceCount = 0;
        char prime, secondary;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        inputString = sc.nextLine();
        i = inputString.length();
        for(prime = 'A'; prime <= 'z'; prime++) {
            for(secondary = 'A'; secondary <= 'z'; secondary++) {
                stringUnit = new String(new char[]{prime, secondary});
                occurrenceCount = 0;
                for(j=0; j < i-1; j++) {
                    comparisonPart = inputString.substring(j, j+2);
                    if(stringUnit.equals(comparisonPart)) occurrenceCount++;
                }
                if(occurrenceCount > 0) System.out.println(stringUnit + ": " + occurrenceCount);
            }
        }
    }
}


