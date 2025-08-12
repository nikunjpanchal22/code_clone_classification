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
    List<Character> characters = text.chars()
                             .mapToObj(e -> (char) e)
                             .collect(Collectors.toList());
    Collections.shuffle(characters);
    StringBuilder shuffled = new StringBuilder(text.length());
    for (Character c : characters) {
        shuffled.append(c);
    }
    return shuffled.toString();
}


