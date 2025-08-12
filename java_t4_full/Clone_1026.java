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
    first = first.toLowerCase ();
    second = second.toLowerCase ();
    if (first.length() != second.length())
        return false;
    Dictionary<Character, Integer> counts1 = new Hashtable<Character, Integer>();
    Dictionary<Character, Integer> counts2 = new Hashtable<Character, Integer>();
    for (char c : first.toCharArray()) {
        if (counts1.containsKey(c))
            counts1.put(c, counts1.get(c) + 1);
        else
            counts1.put(c, 1);
    }
    for (char c : second.toCharArray()) {
        if (counts2.containsKey(c))
            counts2.put(c, counts2.get(c) + 1);
        else
            counts2.put(c, 1);
    }
    for (Enumeration<Character> e1 = counts1.keys(); e1.hasMoreElements();) {
        char c = e1.nextElement();
        if (counts1.get(c) != counts2.get(c))
            return false;
    }
    return true;
}


