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
    char arr[] = str.toCharArray();
    String result = "";
    int counter = 1;
    for (int i= 0; i < str.length(); i++) {
        if (i < arr.length-1){
            if (arr[i] == arr[i+1]){
                counter++;
            }
            else {
                result = result + arr[i] + counter;
                counter = 1;
            }
        }
        else {
            result = result + arr[i] + counter;
        }
    }
    System.out.println("result is = "+result);
}


