public static void main (String args []) {
    inp = new Scanner (System.in);
    String str = inp.nextLine ();
    List < Character > arrlist = new ArrayList < Character > ();
    for (int i = 0;
    i < str.length (); i ++) {
        arrlist.add (str.charAt (i));
    }
    for (int i = 0;
    i < str.length (); i ++) {
        int freq = Collections.frequency (arrlist, str.charAt (i));
        System.out.println ("Frequency of " + str.charAt (i) + "  is:   " + freq);
    }
}


 public static void main (String args []) {
    Scanner inp = new Scanner (System.in);
    String str = inp.nextLine ();
    Map<Character, Integer> map = new HashMap<Character, Integer>();

    for (int i = 0; i < str.length(); i++) {
       if(!map.containsKey(str.charAt(i))){
            map.put(str.charAt(i), 1);
        } else {
            map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
        }
    }
    for(Character c: map.keySet()){
        System.out.println("Frequency of " + c + "  is:   " + map.get(c));
    }
}


