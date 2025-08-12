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


 public static String shuffle(String text){
    char[] characters = text.toCharArray();
    for (int i = 0; i < characters.length; i++) {
        int randIndex = (int)(Math.random() * characters.length);
        char temp = characters[i];
        characters[i] = characters[randIndex];
        characters[randIndex] = temp;
    }
    return new String(characters);
}
