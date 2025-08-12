public static String shuffle (String text) {
    char [] characters = text.toCharArray ();
    for (int i = 0;
    i < characters.length; i ++) {
        int randomIndex = (int) (Math.random () * characters.length);
        char temp = characters [i];
        characters [i] = characters [randomIndex];
        characters [randomIndex] = temp;
    }
    return new String (characters);
}





public static String shuffle(String text) {
    int n = text.length();
    int[] permutation = new Random().ints(0, n).distinct().limit(n).toArray();
    StringBuilder shuffled = new StringBuilder(n);
    for (int i : permutation) {
        shuffled.append(text.charAt(i));
    }
    return shuffled.toString();
}


