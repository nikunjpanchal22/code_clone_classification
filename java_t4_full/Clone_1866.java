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


 public static String shuffle(String text) 
{ 
    char[] characters = text.toCharArray();
    char[] tmp = new char[text.length()];
    Random random = new Random();
 
    for (int i = 0; i < text.length(); i++) {
        int j = random.nextInt(text.length());
        tmp[i] = characters[j];
        characters[j] = characters[i];
    }
    
    return new String(tmp);
}


