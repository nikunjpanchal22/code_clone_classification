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





public static boolean isAnagram(String input1, String input2) {
            return sortStringCharactersAndRemoveSpaces(input1).equalsIgnoreCase(sortStringCharactersAndRemoveSpaces(input2));
        }
        private static String sortStringCharactersAndRemoveSpaces(String input) {
            return input.chars()
                    .mapToObj(i -> (char) i)
                    .sorted()
                    .map(Object::toString)
                    .collect(Collectors.joining())
                    .replace(" ", "");
}


