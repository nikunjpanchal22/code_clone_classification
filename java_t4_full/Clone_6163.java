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
    String[] arr = text.split("");
    List<String> list = Arrays.asList(arr);
    Collections.shuffle(list);
    return list.stream().collect(Collectors.joining());
}


