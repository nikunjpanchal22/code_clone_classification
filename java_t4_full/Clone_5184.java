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
    String output = "";
    while (s.length() > 0) {
        int count = (int) s.chars().filter(ch -> ch == s.charAt(0)).count();
        output += s.charAt(0) + String.valueOf(count);
        s = s.replace(Character.toString(s.charAt(0)),"");
    }
    System.out.println(output);
}


