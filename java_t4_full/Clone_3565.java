public static void CountbyChar (String s) {
    HashMap < Character, Integer > letterCountMap = new HashMap < Character, Integer > ();
    char [] c = s.toCharArray ();
    for (int i = 0;
    i < c.length; i ++) {
        Integer count = 0;
        if (letterCountMap.containsKey (c [i])) {
            count = letterCountMap.get (c [i]) + 1;
        } else {
            count = 1;
        }
        letterCountMap.put (c [i], count);
    }
    for (Map.Entry < String, String > entry : letterCountMap.entrySet ()) {
        System.out.println (entry.getValue () + "( for" + entry.getKey () + " )");
    }
}






public static void CountbyChar (String s) {
    Map<Character, Integer> letterCountMap = new Hashtable<>();
    for(Character c : s.toCharArray()){
        Integer count = letterCountMap.get(c);
        letterCountMap.put(c, (count==null) ? 1 : count+1);
    }
    letterCountMap.forEach((key,value) -> System.out.println(value + " (for" + key + " )"));
}


