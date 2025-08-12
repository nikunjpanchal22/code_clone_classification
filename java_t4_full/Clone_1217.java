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
    String string = "aaabbbbbaccc";
    char ch;
    int count = 0;
    String result = "";
    for ( int i = 0; i <string.length(); i++) {
        ch = string.charAt(i);
        for (int j = 0; j < string.length(); j++) {
            if (string.charAt(j) == ch) 
                count++;
        }
    string = string.replace(Character.toString(ch),"");
    result = result + ch + count;
    count = 0;
    }
    System.out.println ("result is = " + result);
}


