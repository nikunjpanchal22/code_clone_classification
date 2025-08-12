public static void main (String [] args) {
    String str = "abcdabghplhhnfl".toLowerCase ();
    Integer [] ar = new Integer [26];
    for (int i = 0;
    i < str.length (); i ++) {
        int j = str.charAt (i) - 'a';
        if (ar [j] == null) {
            ar [j] = 1;
        } else {
            ar [j] += 1;
        }
    }
    for (int i = 0;
    i < ar.length; i ++) {
        if (ar [i] != null && ar [i] > 1) {
            char c = (char) (97 + i);
            System.out.println ("'" + c + "' comes " + ar [i] + " times.");
        }
    }
}


 public static void main (String [] args) {
     String str = "abcdabghplhhnfl".toLowerCase ();
     Character[] characters = new Character[str.length()];  
     for (int i = 0; i < str.length (); i++) {
         characters[i] = str.charAt (i);
     }
     Arrays.sort(characters);
     // Store occurrence of each character in a map
     Map<Character, Integer> map = new HashMap<>();
     int oldVal = 0;
     for (Character c : characters) {
         Integer newVal = 0;
         if (map.containsKey(c)) {
             oldVal = map.get(c);
             newVal = oldVal + 1;
         } else {
             newVal = 1;
         }
         map.put(c, newVal);
     }
     // Print duplicate characters
     for (Map.Entry<Character, Integer> entry : map.entrySet()) {
         if (entry.getValue() > 1) {
             System.out.println("'" + entry.getKey() + "' comes " + entry.getValue() + " times.");
         }
    }
}


