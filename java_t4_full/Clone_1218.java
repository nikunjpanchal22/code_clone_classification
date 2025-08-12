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
    String result = "";
    while (!str.equals("")) {
        counter = 1;
        char c = str.charAt(0);
        str = str.substring(1);
        while (str.indexOf(c) != -1) {
            counter++;
            str = str.replaceFirst(Character.toString(c), "");
        }
        result = result + c + counter;
    }
    System.out.println("result is = "+result);
}


