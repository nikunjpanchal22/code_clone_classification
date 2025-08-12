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
    String s = "aaabbbbbaccc"; String r = "";
    while(s.length() > 0) {
        int count = (int) s.chars().filter(ch -> ch == s.charAt(0)).count();
        r += s.charAt(0) + Integer.toString(count);
        s = s.replaceAll(Character.toString(s.charAt(0)), "");
    }
    System.out.println(r);
}


