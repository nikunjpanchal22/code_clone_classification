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
    String s = "aaabbbbbaccc";
    StringBuilder result = new StringBuilder();
    int n = s.length();
    for (int i = 0; i < n; i++) {
        int count = 1;
        while ((i < n - 1) && (s.charAt(i) == s.charAt(i + 1))) {
            i++;
            count++;
        }
        result.append(s.charAt(i)).append(count);
    }
    System.out.println(result);
}


