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
    char[] characters = text.toCharArray();
    int length = characters.length;
    for (int i = length; i > 0; i--) {
        int rand = (int) (Math.random() * i);
        char c = characters[rand];
        characters[rand] = characters[i - 1];
        characters[i - 1] = c;
    }
    return new String(characters);
}


