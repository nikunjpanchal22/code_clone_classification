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
    char[] inputCharacters = input.toCharArray();
    char[] listCharacters = list.toCharArray();
    StringBuilder result = new StringBuilder();

    for (int i = 0; i < inputCharacters.length; i++) {
        boolean isInList = false;

        for (int j = 0; j < listCharacters.length; j++) {
            if (listCharacters[j] == inputCharacters[i]) {
                isInList = true;
                break;
            }
        }
        if (!isInList) {
            result.append(inputCharacters[i]);
        }
    }

    return result.toString();
}


