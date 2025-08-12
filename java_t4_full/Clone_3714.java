public static void main (String [] args) throws IOException {
    String ch;
    BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
    System.out.print ("Enter the Statement:");
    ch = br.readLine ();
    int count = 0, len = 0;
    do {
        try {
            char name [] = ch.toCharArray ();
            len = name.length;
            count = 0;
            for (int j = 0;
            j < len; j ++) {
                if ((name [0] == name [j]) && ((name [0] >= 65 && name [0] <= 91) || (name [0] >= 97 && name [0] <= 123))) count ++;
            }
            if (count != 0) System.out.println (name [0] + " " + count + " Times");
            ch = ch.replace ("" + name [0], "");
        } catch (Exception ex) {
        }
    } while (len != 1);
}




public static void main (String [] args) throws IOException {
    String ch;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print ("Enter the Statement:");
    ch = br.readLine ();

    Map<Character, Integer> charCountMap = new HashMap<>();

    for(int i = 0; i < ch.length(); i++) {
        char c = ch.charAt(i);
        if(Character.isLetter(c)) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
    }

    for(Map.Entry<Character, Integer> entry: charCountMap.entrySet()) {
        System.out.println(entry.getKey() + " " + entry.getValue() + " Times");
    }
} 


