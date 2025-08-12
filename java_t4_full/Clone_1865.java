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
    List<Character> characters = new LinkedList<>(); 
    for (char c : text.toCharArray()) { 
        characters.add(c);
    } 
     
    StringBuilder sb = new StringBuilder(text.length()); 
    while (characters.size() != 0) 
    {
        int randPicker = (int) (Math.random() * characters.size()); 
        sb.append(characters.remove(randPicker)); 
    } 
     
    return sb.toString(); 
}


