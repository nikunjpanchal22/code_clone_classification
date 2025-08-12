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





public static void main(String...strings){
    String numA = "108";
    String numB = "84";
    int res = 0;
    for(int i=0;i<numA.length();i++){
        for(int j=0;j<numB.length();j++){
            res += (int)(Math.pow(10,numA.length()+numB.length()-i-j-2)*(numA.charAt(i)-48) * (numB.charAt(j)-48));
        }
    }
    System.out.println(res);
}


