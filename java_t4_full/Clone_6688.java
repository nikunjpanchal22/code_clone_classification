public static void main (String [] args) {
    String number1 = "108";
    String number2 = "84";
    char [] n1 = number1.toCharArray ();
    char [] n2 = number2.toCharArray ();
    int result = 0;
    for (int i = 0;
    i < n1.length; i ++) {
        for (int j = 0;
        j < n2.length; j ++) {
            result += (n1 [i] - '0') * (n2 [j] - '0') * (int) Math.pow (10, n1.length + n2.length - (i + j + 2));
        }
    }
    System.out.println (result);
}



 

public static void main (String [ ] args) {
    String s1 = "108";
    String s2 = "84";
    int out = 0;
    for (int i = 0; i < s1.length(); i++) {
        for (int j = 0; j < s2.length(); j++) {
            out += (s1.charAt(i) - '0') * (s2.charAt(j) - '0') * Math.pow(10, s1.length() + s2.length() - i - j - 2);
        }
    }
    System.out.println(out);
}


