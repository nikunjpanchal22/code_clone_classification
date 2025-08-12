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
    int len = text.length();
    char[] characters = new char[len];
    for(int i=0; i<len; i++){
        int r = (int)(Math.random()*len);
        characters[r] = text.charAt(i);
    }
    return new String(characters);
}


