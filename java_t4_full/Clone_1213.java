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
    StringBuilder result = new StringBuilder();
    int count = 1;
    char lastChar = str.charAt(0);
    for(int i=1; i<str.length(); i++) {
        char currentChar = str.charAt(i);
        if(currentChar == lastChar) {
            count++;
        } else {
            result.append(lastChar);
            result.append(count);
            lastChar = currentChar;
            count = 1;
        }
    }
    result.append(lastChar);
    result.append(count);
    System.out.println("result is ="+ result);
}


