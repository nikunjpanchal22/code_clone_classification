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
    char array[] = str.toCharArray();
    str = "";
    int counter;
    for(int i=0; i<array.length; i++){
        counter = 1;
        for(int j=i+1; j<array.length; j++){
            if(array[i]==array[j]){
                counter++;
            }
        }
        str = str + array[i] + counter;
        array[i] = 0;
    }
    System.out.println("result is = " + str);
}


