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
        String string = "aaabbbbbaccc";
        int totalLength = string.length ();
        String result = "";
        int startIndex = 0;
        while (startIndex < totalLength){
            int count = 0;
            for (int i = startIndex; i < totalLength; i++){
                if (string.charAt(startIndex) == string.charAt (i)){
                    count ++;
                }
            }
            result = result + string.charAt (startIndex) + count;
            string = string.replaceAll (String.valueOf (string.charAt (startIndex)), "");
            startIndex ++;
        }
        System.out.println ("result is = " + result);
}


