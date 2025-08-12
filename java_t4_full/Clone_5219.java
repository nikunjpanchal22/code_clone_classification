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
    StringBuilder res = new StringBuilder();
    while (str.length() > 0) {
        int count = (int) str.chars().filter(ch -> ch == str.charAt(0)).count();
        res.append(str.charAt(0)).append(count);
        str = str.replaceAll(Character.toString(str.charAt(0)), "");
    }
    System.out.println(res);
}


