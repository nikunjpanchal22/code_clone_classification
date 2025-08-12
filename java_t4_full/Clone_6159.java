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
    StringBuilder builder = new StringBuilder(text);
    Random rnd = new Random();
    for(int i = builder.length() - 1; i >= 0; i --) {
        int index = rnd.nextInt(i + 1);
        char temp = builder.charAt(i);
        builder.setCharAt(i, builder.charAt(index));
        builder.setCharAt(index, temp);
    }
    return builder.toString();
}


