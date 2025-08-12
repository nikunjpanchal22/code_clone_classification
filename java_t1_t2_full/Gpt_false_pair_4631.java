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


public static String shuffleType3 (String inputText) {
    char [] characters = inputText.toCharArray ();
    for (int i = 0;
    i < characters.length; i ++) {
        int randomNumber = (int) (Math.random () * characters.length);
        char tempCharacter = characters [i];
        characters [i] = characters [randomNumber];
        characters [randomNumber] = tempCharacter;
    }
    return new String (characters);
}
