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
    char[] chars = "aaabbbbbaccc".toCharArray();
    java.util.Map<Character, Integer> frequencyMap = new java.util.HashMap<>();
    for (char c : chars) {
        if (frequencyMap.containsKey(c)) {
            frequencyMap.put(c, frequencyMap.get(c) + 1);
        } else {
            frequencyMap.put(c, 1);
        }
    }
    StringBuilder sb = new StringBuilder();
    frequencyMap.forEach((key, value) -> sb.append(key).append(value));
    System.out.println(sb);
}


