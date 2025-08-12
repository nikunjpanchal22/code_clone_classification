static String shuffle (String text) {
    if (text.length () <= 1) return text;
    int split = text.length () / 2;
    String temp1 = shuffle (text.substring (0, split));
    String temp2 = shuffle (text.substring (split));
    if (Math.random () > 0.5) return temp1 + temp2;
    else return temp2 + temp1;
}





static String shuffle (String text) {
    char[] characters = text.toCharArray();
    Random rand = ThreadLocalRandom.current();
    for (int i = characters.length - 1; i > 0; i--) {
        int index = rand.nextInt(i + 1);
        char tmp = characters[index];
        characters[index] = characters[i];
        characters[i] = tmp;
    }
    return new String(characters);
}


