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
    List<Character> charsList = text.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
    java.util.Collections.shuffle(charsList);
    return charsList.stream().map(String::valueOf).collect(Collectors.joining());
}


