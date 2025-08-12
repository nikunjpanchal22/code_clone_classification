public static void main (String [] args) {
    String string = "aaabbbbbaccc";
    int counter;
    String result = "";
    int i = 0;
    while (i < string.length ()) {
        counter = 1;
        for (int j = i + 1;
        j < string.length (); j ++) {
            System.out.println ("string length =" + string.length ());
            if (string.charAt (i) == string.charAt (j)) {
                counter ++;
            }
        }
        result = result + string.charAt (i) + counter;
        string = string.replaceAll (String.valueOf (string.charAt (i)), "");
    }
    System.out.println ("result is = " + result);
}


public static void main (String [] args) {
    String str1 = "aaabbbbbaccc";
    int count;
    String solution = "";
    int a = 0;
    while (a < str1.length ()) {
        count = 1;
        for (int b = a + 1;
        b < str1.length (); b++) {
            System.out.println ("string length =" + str1.length ());
            if (str1.charAt (a) == str1.charAt (b)) {
                count ++;
            }
        }
        solution = solution + str1.charAt (a) + count;
        str1 = str1.replaceAll (String.valueOf (str1.charAt (a)), "");
    }
    System.out.println ("end result is = " + solution);
}
