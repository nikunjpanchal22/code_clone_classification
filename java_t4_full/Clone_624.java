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
     Map<Character, Integer> map = new HashMap<>();
     // Store the occurrence of each character
     for (int i = 0; i < str.length (); i++) {
         char c = str.charAt(i);
         int val = 0;
         if (map.containsKey(c)) {
             val = map.get(c);
         }
         map.put(c, ++val);
     }
     for (Map.Entry<Character, Integer> entry : map.entrySet()) {
         if (entry.getValue() > 1) {
             System.out.println("'" + entry.getKey() + "' comes " + entry.getValue() + " times.");
         }
     }
}


