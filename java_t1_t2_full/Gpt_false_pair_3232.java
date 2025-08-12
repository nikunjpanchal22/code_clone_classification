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
    String str = "aaabbbbbaccc";
    int counter;
    String res = "";
    int i = 0;
    while (i < str.length ()) {
        counter = 1;
        for (int j = i + 1;
        j < str.length (); j ++) {
            System.out.println ("string length =" + str.length ());
            if (str.charAt (i) == str.charAt (j)) {
                counter ++;
            }
        }
        res = res + str.charAt (i) + counter;
        str = str.replaceAll (String.valueOf (str.charAt (i)), "");
    }
    System.out.println ("result is = " + res);
}
