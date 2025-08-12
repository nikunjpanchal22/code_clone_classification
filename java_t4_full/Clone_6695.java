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



 

public static void main (String [] args) {
    String val1 = "108", val2 = "84";
    int computation = 0;
    for (int i = 0; i < val1.length(); i ++) {
        for (int j = 0; j < val2.length(); j ++) {
            computation += (val1.charAt(i) - '0') * (val2.charAt(j) - '0') * (int) Math.pow (10, val1.length()+val2.length()-i-j-2);
        }
    }
    System.out.println (computation);
}


