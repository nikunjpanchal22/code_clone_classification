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
    int[] counts = new int[256];
    for (char c : s.toCharArray()) {
        counts[c]++;
    }
    IntStream.range(0, 256).forEach(i -> {
        if (counts[i] > 0) System.out.println(counts[i] + " (for " + (char) i + " )");
    });
}


