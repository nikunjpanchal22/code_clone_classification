public static boolean isAnagram (String first, String second) {
    String positive = first.toLowerCase ();
    String negative = second.toLowerCase ();
    if (positive.length () != negative.length ()) {
        return false;
    }
    int [] counts = new int [26];
    int diff = 0;
    for (int i = 0;
    i < positive.length (); i ++) {
        int pos = (int) positive.charAt (i) - 97;
        if (counts [pos] >= 0) {
            diff ++;
        } else {
            diff --;
        }
        counts [pos] ++;
        int neg = (int) negative.charAt (i) - 97;
        if (counts [neg] <= 0) {
            diff ++;
        } else {
            diff --;
        }
        counts [neg] --;
    }
    return diff == 0;
}


 public static boolean isAnagram (String first, String second)
{ 
    if (first.length() != second.length())
        return false;
    Map<Character, Integer> map1 = new HashMap<>();
    Map<Character, Integer> map2 = new HashMap<>();
    for (int i = 0; i < first.length(); i++)
    {
        if (!map1.containsKey(first.charAt(i)))
            map1.put(first.charAt(i), 1);
        else
        {
            int oldValue = map1.get(first.charAt(i));
            map1.put(first.charAt(i), oldValue + 1);
        }
        if (!map2.containsKey(second.charAt(i)))
            map2.put(second.charAt(i), 1);
        else
        {
            int oldValue = map2.get(second.charAt(i));
            map2.put(second.charAt(i), oldValue + 1);
        }
    }
    return map1.equals(map2);
}


