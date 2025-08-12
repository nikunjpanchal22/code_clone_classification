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
    StringBuilder sb = new StringBuilder();
    while (string.length() > 0) {
        char c = string.charAt(0);
        int count = (int) string.chars().filter(ch -> ch == c).count();
        sb.append(c).append(count);
        string = string.replaceAll(String.valueOf(c), "");
    }
    System.out.println(sb);
}


