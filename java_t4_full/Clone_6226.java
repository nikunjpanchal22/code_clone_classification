public static void countString (String str) {
    if (str != null) {
        int length = str.length ();
        char ch [] = str.toCharArray ();
        Arrays.sort (ch);
        if (length > 0) {
            char x = ch [0];
            int count = 1;
            for (int i = 1;
            i < length; i ++) {
                if (ch [i] == x) {
                    count ++;
                } else {
                    System.out.println ("Number of Occurrence of '" + ch [i - 1] + "' is: " + count);
                    x = ch [i];
                    count = 1;
                }
            }
            System.out.println ("Number of Occurrence of '" + ch [length - 1] + "' is: " + count);
        }
    }
}



 

public static void countString (String str) {
    Map<Character, Integer> cn = new HashMap<>();
    for(char ch : str.toCharArray())
        cn.put(ch, cn.getOrDefault(ch, 0) + 1);
    for(Map.Entry<Character, Integer> e : cn.entrySet())
        System.out.println("Number of Occurrence of '" + e.getKey() + "' is: " + e.getValue());
}


