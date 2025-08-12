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
    String num1 = "108";
    String num2 = "84";
    int output = 0;
    for (int i = 0;
    i < num1.length(); i++) {
        for (int j = 0;
        j < num2.length(); j++) {
            output += (num1.charAt(i) - '0') * (num2.charAt(j) - '0') * (int) Math.pow(10, num1.length()+num2.length()-i-j-2);
        }
    }
    System.out.println (output);
}


