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
    ThreadLocalRandom.current().ints(0, characters.length)
        .distinct().limit(characters.length).forEach(i -> {
            int randomIndex = ThreadLocalRandom.current().nextInt(characters.length);
            char temp = characters[i];
            characters[i] = characters[randomIndex];
            characters[randomIndex] = temp;
        });
    return new String(characters);
}


