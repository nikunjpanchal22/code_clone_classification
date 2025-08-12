public static void main (String...a) {
    System.out.print ("Enter the String");
    Scanner sc = new Scanner (System.in);
    String st = sc.nextLine ();
    int [] ar = new int [256];
    for (int i = 0;
    i < st.length (); i ++) {
        ar [st.charAt (i)] = ar [st.charAt (i)] + 1;
    }
    for (int i = 0;
    i < 256; i ++) {
        char ch = (char) i;
        if (ar [i] > 0) {
            if (ar [i] == 1) {
                System.out.print (ch);
            } else {
                System.out.print (ch + "" + ar [i]);
            }
        }
    }
}


 public static void main (String...a) {
    System.out.print ("Enter the String:");
    Scanner sc = new Scanner (System.in);
    String st = sc.nextLine ();
    Map<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < st.length (); i++) {  
        //Checking whether the map contains the character 'st.charAt(i)'
        if (map.containsKey(st.charAt(i))) {
            int count = map.get(st.charAt(i));
            map.put(st.charAt(i), ++count);
            //Put the character 'st.charAt (i)' and the incremented count in the Map
        } else {    
            //If the character does not exist, put it and make the count as 1
            map.put(st.charAt(i), 1);
        }
    }
    for (Map.Entry entry: map.entrySet()) {
        System.out.print(entry.getKey() + "" + entry.getValue());
    }
}


