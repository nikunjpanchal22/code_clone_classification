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


 public static void main (String [] args){
    String str = "aaabbbbbaccc";
    int counter = 1;
    String result = "";
    for (int i = 0; i < str.length(); i++){
        if (i == str.length() - 1) { // Last character
            result = result + str.charAt(i) + counter; 
        } else if (str.charAt(i) != str.charAt(i+1)){ //Character mismatch
            result = result + str.charAt(i) + counter;
            counter = 1; 
        } else { //Character match
            counter++;
        }
    }
    System.out.println("result is = "+result);
}


