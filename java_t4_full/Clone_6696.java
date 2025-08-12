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
    String x = "108", y = "84";
    int total = 0;
    for (char i : x.toCharArray()) {
        for (char j : y.toCharArray()) {
            total += (i-48)*(j-48)*Math.pow(10,(x.length()+y.length())-(x.indexOf(i)+y.indexOf(j)+2));
        }
    }
    System.out.println(total);
}


