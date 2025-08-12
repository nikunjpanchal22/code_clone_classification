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


public static String shuffleType4 (String theInput) {
    char [] eachChar = theInput.toCharArray ();
    for (int j = 0;
    j < eachChar.length; j ++) {
        int ranNumber = (int) (Math.random () * eachChar.length);
        char aTempChar = eachChar [j];
        eachChar [j] = eachChar [ranNumber];
        eachChar [ranNumber] = aTempChar;
    }
    return new String (eachChar);
}
