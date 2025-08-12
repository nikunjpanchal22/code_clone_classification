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




public static void main (String [] args) {
    String string = "aaabbbbbaccc";
    int i = 0;
    int counter = 1;
    String result = "";
    HashMap<Character, Integer> map = new HashMap<>();
    while (i < string.length()) {
        while (i + 1 < string.length() && string.charAt(i) == string.charAt(i + 1)) {
            counter++;
            i++;
        }
        char currentChar = string.charAt(i);
        if (map.containsKey(currentChar)) {
            counter = map.get(currentChar) + counter;
        }
        map.put(currentChar, counter);
        counter = 1;
        i++;
    }
    for (Map.Entry<Character, Integer> entry : map.entrySet()) {
        Character c = entry.getKey();
        Integer count = entry.getValue();
        result = result + c + count;
    }
    System.out.println ("result is = " + result);
}


