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
    Random rnd = new Random();
    for (int i = characters.length - 1; i > 0; i--) {
        int index = rnd.nextInt(i + 1);
        char a = characters[index];
        characters[index] = characters[i];
        characters[i] = a;
    }
    return new String(characters);
}


