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


 public static String shuffle (String text)
{ 
    char [] characters = text.toCharArray(); 
    List<Character> list = new ArrayList<>(); 
   
    for (char c : characters) 
        list.add(c); 
       
    Collections.shuffle(list); 
   
    StringBuilder output = new StringBuilder(list.size()); 
    for (Character c : list) 
        output.append(c); 
       
    return output.toString(); 
} 


