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




public static void main(String[] args) {
    String string = "aaabbbbbaccc";
    int resultIndex = 0;
    int count = 1;
    char[] resultArray = new char[string.length() * 2];

    for(int i = 1; i < string.length(); i++) {
        if(string.charAt(i) == string.charAt(i - 1)) {
            count++;
        } else {
            resultArray[resultIndex++] = string.charAt(i - 1);
            resultArray[resultIndex++] = (char)(count + '0');
            count = 1;
        }

        if(i == string.length() - 1) {
            resultArray[resultIndex++] = string.charAt(i);
            resultArray[resultIndex++] = (char)(count + '0');
        }
    }

    System.out.println("result is = " + new String(resultArray));
}


