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
    TreeMap<Character, Integer> countsOfFirstWord = new TreeMap<> ();
    TreeMap<Character, Integer> countsOfSecondWord = new TreeMap<> ();
    first = first.toLowerCase ();
    second = second.toLowerCase ();
    for (char ch : first.toCharArray ()) {
        countsOfFirstWord.put (ch, countsOfFirstWord.getOrDefault (ch, 0) + 1);
    }
    for (char ch : second.toCharArray ()) {
        countsOfSecondWord.put (ch, countsOfSecondWord.getOrDefault (ch, 0) + 1);
    }
    return countsOfFirstWord.equals (countsOfSecondWord);
}


