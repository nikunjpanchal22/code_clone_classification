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
    List<Character> textList = new ArrayList<Character>();
    for(char c : text.toCharArray())
        textList.add(c);
     
    Collections.shuffle(textList); 
     
    StringBuilder sb= new StringBuilder();
    for(char c : textList)
        sb.append(c);
     
    return sb.toString();
}


