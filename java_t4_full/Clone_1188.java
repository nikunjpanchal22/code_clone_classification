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
    int counter;
    String result = "";
    int i = 0;
    HashMap<Character, Integer> map = new HashMap<>();
    for(i = 0; i < string.length(); i++) {
        char c = string.charAt(i);
        if(map.containsKey(c)) {
            counter = map.get(c);
            counter++;
            map.put(c, counter);
        } else {
            map.put(c, 1);
        }
    }
    
    for (Map.Entry<Character, Integer> entry : map.entrySet()) {
        Character c = entry.getKey();
        Integer count = entry.getValue();
        result = result + c + count;
    }
    System.out.println ("result is = " + result);
}


