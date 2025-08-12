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
    int[] array = new int[text.length()]; 
    for(int i = 0; i < text.length(); i++) 
    { 
        array[i] = text.charAt(i); 
    } 
    for(int i = 0; i < text.length(); i++) 
    { 
        int randomIndex = (int)(Math.random() * text.length()); 
          
        int temp = array[i]; 
        array[i] = array[randomIndex]; 
        array[randomIndex] = temp; 
    } 
  
    char[] shuffledText = new char[array.length]; 
    for(int i = 0; i < shuffledText.length; i++) 
    { 
        shuffledText[i] = (char)array[i]; 
    } 
    return new String(shuffledText); 
}


