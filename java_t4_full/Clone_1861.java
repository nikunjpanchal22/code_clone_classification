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


 public static String shuffle (String text) {
    List<Character> characters = new ArrayList<>();
    for(char c :  text.toCharArray())
        characters.add(c);
    Collections.shuffle(characters);
    StringBuilder sb = new StringBuilder(text.length());
    for (Character c : characters)
        sb.append(c);
    return sb.toString();
}


