public static String myTrim (String input, String list) {
    String r = "";
    for (int i = 0;
    i < input.length (); i ++) {
        int k = 0;
        for (; k < list.length (); k ++) {
            if (input.charAt (i) == list.charAt (k)) {
                break;
            }
        }
        if (k == list.length ()) r += input.charAt (i);
    }
    return r;
}


 public static String myTrim(String input, String list) {
    char[] inputArray = input.toCharArray();
    char[] listArray = list.toCharArray();
    StringBuilder resultString = new StringBuilder();

    for (int i = 0; i < inputArray.length; i++) {
        boolean isFound = false;
        for (char letter : listArray) {
            if (letter == inputArray[i]) {
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            resultString.append(inputArray[i]);
        }

    }
    return resultString.toString();
}


