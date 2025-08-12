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
    for(int i=0; i<characters.length-1; i++){
        int r = (int)(Math.random() * (characters.length-i)) + i;
        char temp = characters[i];
        characters[i] = characters[r];
        characters[r] = temp;
    }
    return new String(characters);
} 


