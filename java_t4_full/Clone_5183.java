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



public static void main(String[] args) {
    String str = "aaabbbbbaccc";
    StringBuilder result = new StringBuilder();
    while (!str.isEmpty()) {
        char ch = str.charAt(0);
        long count = str.chars().filter(c -> c == ch).count();
        result.append(ch).append(count);
        str = str.replace(String.valueOf(ch), "");
    }
    System.out.println(result);
}


